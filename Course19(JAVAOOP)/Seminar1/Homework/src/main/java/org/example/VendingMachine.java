package org.example;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;


    Product getProduct(String name, Double volume, Double temperature);
}
