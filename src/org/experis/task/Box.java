package org.experis.task;

public class Box <T extends Packable> {
    private final T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

}
