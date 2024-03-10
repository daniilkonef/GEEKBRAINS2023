package org.example;

public class Box {
    private Object object1;
    Box(Object object1){
        this.object1 = object1;
    }

    public Object getObject1() {
        return object1;
    }

    public void setObject1(Object object1) {
        this.object1 = object1;
    }

    public void printInfo(){
        System.out.printf("Box (%s): %s\n", object1.getClass().getSimpleName(), object1.toString());
    }
}
