package org.example;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(20);
        Box box2 = new Box(30);
        System.out.println( (Integer) box1.getObject1() + (Integer) box2.getObject1() );

        Box box3 = new Box("20+");
        Box box4 = new Box("30");
        System.out.println( (String) box3.getObject1() + (String) box4.getObject1() );

        GBox<String> box5 = new GBox<String>("KONEF");
        box5.showType();

        GBox<Integer> box6 = new GBox<Integer>((Integer) 77);
        box6.showType();

        Collection<Integer,String> myCol_1 = new Collection<>(1,"KONEF");
        myCol_1.showType();

        System.out.println();
        System.out.println();
        System.out.println();

        Collection<Integer,GBox<String> > myCol_2 = new Collection<>(1,new GBox<>("JAVASUPERKONEF"));
        myCol_2.showType();

        System.out.println();
        System.out.println();
        System.out.println();

        GBox<Integer> box7 = new GBox<>(null);
        GBox.setIfNull(box7,13);
        System.out.println("box7.getValue() = "+box7.getValue());
    }
}

