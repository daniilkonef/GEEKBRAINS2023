package Application.Presenter;

import java.util.Locale;

public interface Console {

    static <T> void print(T t) {
        System.out.print(t);
    }

    static <Type> void printLine(Type text) {
        System.out.println(text);
    }

    static void printf(String str, Object... objects) {
        System.out.printf(str, objects);
    }

    static void printf(Locale locale, String str, Object... objects) {
        System.out.printf(locale, str, objects);
    }
}