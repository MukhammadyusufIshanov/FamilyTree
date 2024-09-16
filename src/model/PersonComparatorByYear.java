package model;

import java.util.Comparator;

public class PersonComparatorByYear<E extends TreeItem<E>> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
            
        return o1.getYear()-o2.getYear();
    }
}
