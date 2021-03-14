package org.obrii.mit.dp2021.jurilents.laba3.db.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface DbField {
    String name();
    String opts();
}
