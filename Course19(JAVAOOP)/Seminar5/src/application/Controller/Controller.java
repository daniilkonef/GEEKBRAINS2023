// https://translate.google.ru/?hl=ru&tab=TT&sl=ru&tl=en&text=%D0%BA%D1%80%D1%83%D0%B3&op=translate
// https://gb.ru/lessons/344141
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final Service service = new Service();


    public static void main(String[] args) {
        Student s1 = new Student("ИмяСтудента1","","");
        Student s2 = new Student("ИмяСтудента2","","");
        Student s3 = new Student("ИмяСтудента3","","");

        Teacher t1 = new Teacher("ИмяПрепода1","","");
        Teacher t2 = new Teacher("ИмяПрепода2","","");
        Teacher t3 = new Teacher("ИмяПрепода3","","");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());


    }

}


