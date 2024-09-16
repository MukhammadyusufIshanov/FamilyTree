package model;

import java.util.Iterator;
import java.util.List;

public class PersonIterator<E extends TreeItem<E>> implements Iterator<E> {

    private int curIndex;
    private List<E> humans;

    public PersonIterator(List<E> humans) {
        this.humans = humans;
    }

    @Override
    public boolean hasNext() {
        return humans.size()>curIndex;
    }

    @Override
    public E next() {
        return humans.get(curIndex++);
    }
}
