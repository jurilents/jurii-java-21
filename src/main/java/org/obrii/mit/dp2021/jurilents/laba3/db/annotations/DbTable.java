package org.obrii.mit.dp2021.jurilents.laba3.db.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface DbTable {
    String name();
}
