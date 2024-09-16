package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Tree<E extends TreeItem<E>> implements Serializable, Iterable<E> {
    protected List<E> itemList = new ArrayList<>();


    public void addToList(E item){
        itemList.add(item);
    }


    @Override
    public String toString() {
        return itemList.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new PersonIterator<>(itemList);
    }
}
