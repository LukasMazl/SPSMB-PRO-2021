package cz.spsmb.lesson24th.list;

public interface MyList<E> {

    void add(E item);

    void remove(int index);

    E get(int index);

    void replace(int index, E newValue);

    int size();
}
