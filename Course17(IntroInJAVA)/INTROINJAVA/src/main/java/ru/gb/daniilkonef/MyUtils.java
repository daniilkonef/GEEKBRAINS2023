package ru.gb.daniilkonef;

public class MyUtils {
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
