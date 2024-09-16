package model;

import java.io.Serializable;

public interface Writer {
    boolean write(Serializable serializable);
    Object read();
    void setPath(String filePath);
}
