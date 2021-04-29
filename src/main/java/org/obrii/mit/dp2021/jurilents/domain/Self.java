package org.obrii.mit.dp2021.jurilents.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Self {

    private String href;

    public Self() { }


    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "Self{" + "href=" + href + '}';
    }

}