package org.obrii.mit.dp2021.jurilents.laba3;

public class DataWrapper<TData> {
    private TData data;

    public DataWrapper(TData data) {
        this.data = data;
    }

    public TData getData() { return data; }
    public void setData(TData data) { this.data = data; }

    public String getString() {
        return "Wrapped data " + data.toString();
    }

    @Override
    public String toString() {
        return String.format("DataWrapper{data=%s}", data);
    }
}
