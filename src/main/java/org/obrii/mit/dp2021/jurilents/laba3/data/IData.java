package org.obrii.mit.dp2021.jurilents.laba3.data;

import java.sql.ResultSet;

public interface IData {
    int getId();
    String getValues();
    String getKeysAndValues();

    static IData parse(ResultSet rs) { throw new RuntimeException(); }
}
