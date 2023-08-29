package daniilkonef;

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] array = new int[10];
        System.out.println(array[11]); // Выход за пределы массива

    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 10/0;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        Integer.parseInt("konef");

    }
}