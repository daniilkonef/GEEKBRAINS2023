public class Program {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}


public class A {}
public class B extends A {}
public class C extends A {}
public class D {}

class Gen<T> {
    T object;

    public Gen(T object) {
        this.object = object;
    }
}

public class UseGen{
    static void test(Gen<? extends A> anyObject){

    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> g1 = new Gen<>(a);
        Gen<B> g2 = new Gen<>(b);
    }
}

