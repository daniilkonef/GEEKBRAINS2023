package org.example;

public class Collection<K,V>{
    private K key;
    private V value;

    public Collection(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void showType(){
        System.out.printf("Тип ключа %s, key=%s \r\n", key.getClass(),getKey());
        System.out.printf("Тип значения %s, value=%s \r\n", value.getClass(), getValue() );
    }




}
