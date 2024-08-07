package org.javaacademy.core.homework.homework2.office;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void scream(){
        System.out.println("я ничего не успеваю, помогите!");
    }
}
