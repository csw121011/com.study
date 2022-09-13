package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Piont {
    Collection c =new ArrayList();
    private int x;
    private int y;

    public Piont() {
    }
    public Piont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piont piont = (Piont) o;
        return x == piont.x && y == piont.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Piont{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
