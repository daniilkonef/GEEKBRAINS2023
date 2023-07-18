package ru.gb.daniilkonef;

class Node {

    Node left, right;
    int data;

    // красный ==> true, черный ==> false
    boolean color;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;

// Новый узел, который создается, является всегда красного цвета.
        color = true;
    }
}
