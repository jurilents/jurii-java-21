package org.obrii.mit.dp2021.jurilents.laba3.db;

import java.sql.SQLException;
import java.util.List;

public interface IDbProvider<TData> {

    void create(TData addingData) throws SQLException;

    List<TData> read() throws SQLException;

    void update(int oldId, TData updatingData) throws SQLException;

    void delete(int id) throws SQLException;

}
