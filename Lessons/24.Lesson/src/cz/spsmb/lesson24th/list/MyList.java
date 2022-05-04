package cz.spsmb.lesson24th.list;

public interface MyList {

    void add(int item);

    void remove(int index);

    int get(int index);

    void replace(int index, int newValue);

    int size();
}
