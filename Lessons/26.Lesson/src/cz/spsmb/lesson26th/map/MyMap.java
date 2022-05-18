package cz.spsmb.lesson26th.map;

public interface MyMap<K, V> {

    void put(K key, V value);

    V get(K key);

    int size();

}
