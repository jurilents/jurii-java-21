package org.obrii.mit.dp2021.jurilents.laba3.db;

import org.obrii.mit.dp2021.jurilents.laba3.data.IData;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SpringDbProvider<TData extends IData<TData>> implements IDbProvider<TData> {

    @Autowired
    IHibernateContext<TData> db;

    public SpringDbProvider() { }


    @Override
    public void create(TData addingData) throws SQLException {
        this.db.save(addingData);
    }

    @Override
    public List<TData> read() {
        List<TData> dataList = new ArrayList<>();
        for (TData item : this.db.findAll()) {
            dataList.add(item);
        }
        return dataList;
    }

    @Override
    public void update(int oldId, TData updatingData) throws SQLException {
        Optional<TData> updateOpt = this.db.findById(oldId);
        if (updateOpt.isPresent()) {
            TData instance = updateOpt.get();
            instance.setAll(instance);
            this.db.save(instance);
        }
    }

    @Override
    public void delete(int id) {
        this.db.deleteById(id);
    }
}
