package org.obrii.mit.dp2021.jurilents.laba3.db;

import java.util.List;

public interface IDbProvider<TData> {

    void create(TData addingData);

    List<TData> read();

    void update(TData data);

    void delete(int id);

}
