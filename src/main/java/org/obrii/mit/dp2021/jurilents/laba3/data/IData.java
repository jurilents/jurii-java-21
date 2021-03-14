package org.obrii.mit.dp2021.jurilents.laba3.data;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IData {
    int getId();
    String getValues();
    String getKeysAndValues();
    Object parse(ResultSet rs) throws SQLException;
}
