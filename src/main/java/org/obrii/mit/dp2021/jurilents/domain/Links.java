package org.obrii.mit.dp2021.jurilents.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Links {

    private Self self;

    public Links() { }


    public Self getSelf() {
        return self;
    }

    public void setSelf(Self self) {
        this.self = self;
    }


    @Override
    public String toString() {
        return "Links{" + "self=" + self + '}';
    }
}
