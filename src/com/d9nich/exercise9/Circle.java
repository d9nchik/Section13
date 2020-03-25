package com.d9nich.exercise9;

import com.d9nich.exercise6.ComparableCircle;

import java.util.Objects;

public class Circle extends ComparableCircle {
    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle)
            return (getRadius() == ((com.d9nich.exercise5.Circle) o).getRadius());
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDateCreated(), getRadius(), isFilled());
    }
}
