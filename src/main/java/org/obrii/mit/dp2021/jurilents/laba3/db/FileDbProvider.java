package org.obrii.mit.dp2021.jurilents.laba3.db;

import org.obrii.mit.dp2021.jurilents.laba3.data.IData;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileDbProvider<TData extends IData> implements IDbProvider<TData> {

    private File file;
    private final Logger logger;

    public FileDbProvider() {
        logger = Logger.getLogger(FileDbProvider.class.getName());
    }

    public FileDbProvider(File file) {
        this();
        this.file = file;
    }

    public void write(Collection<TData> addingData) {
        try (FileOutputStream f = new FileOutputStream(file);
             ObjectOutputStream o = new ObjectOutputStream(f)) {

            addingData.forEach(d -> {
                try {
                    o.writeObject(d);
                } catch (IOException ex) {
                    logger.log(Level.SEVERE, null, ex);
                }
            });

        } catch (IOException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void create(TData addingData) {
        List<TData> data = this.read();
        data.add(addingData);
        this.write(data);
        logger.log(Level.INFO, "Data created");
    }

    @Override
    public List<TData> read() {
        try (FileInputStream f = new FileInputStream(file);
             ObjectInputStream o = new ObjectInputStream(f)) {

            List<TData> result = new ArrayList<>();
            while (f.available() > 0) {
                result.add((TData) o.readObject());
            }

            logger.log(Level.INFO, "Data read");
            return result;

        } catch (IOException | ClassNotFoundException ex) {
            logger.log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }

    @Override
    public void update(int oldId, TData newData) {
        List<TData> data = this.read();
        data.stream() // remove if it already exist
                .filter(d -> d.getId() == oldId)
                .findFirst().ifPresent(o -> data.remove(o));

        logger.log(Level.INFO, "Data updated");
        data.add(newData); // add new instance
        this.write(data);
    }

    @Override
    public void delete(int id) {
        System.out.println("ID: " + id);
        List<TData> data = this.read();
        System.out.println("data : " + data.size());
        data.stream() // remove if it already exist
                .filter(d -> d.getId() == id)
                .findFirst().ifPresent(o -> data.remove(o));
        System.out.println("okk");

        logger.log(Level.INFO, "Data deleted");
        this.write(data);
    }
}
