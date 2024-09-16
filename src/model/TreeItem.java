package model;

import java.io.Serializable;

public interface TreeItem<E> extends Serializable, Comparable<E>{
    String getInfo();
    int getYear();
}
