package org.example;

public class GBox<T>{
    /*field*/ private T value;
    /*constructor*/ GBox(T value) {this.value=value;}
    /*method*/ public T getValue(/**/) {return this.value;}
    /*method*/ public void showType(){
        System.out.printf("Это тип %s со значением %s \n", value.getClass().getSimpleName(), getValue());
        System.out.printf("Это тип %s со значением %s \n", value.getClass(), getValue());
    }

    public GBox<T> setValue(T value) {
        this.value = value;
        return this;
    }

    public static <T> void setIfNull(GBox<T> box, T t) {
        if (box.getValue() == null) box.setValue(t);
    }



}
