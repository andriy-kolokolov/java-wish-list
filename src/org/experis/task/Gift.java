package org.experis.task;

public class Gift implements Packable {
    private final String name;

    public Gift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
