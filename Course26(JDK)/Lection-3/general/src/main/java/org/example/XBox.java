package org.example;

public class XBox<V extends Number>{
    private V value;

    public XBox<V> setValue(V value) {
        this.value = value;
        return this;
    }

}
