package com.daniu101;

public class Dog {

    private String name;

    public Dog(String name){
        this.name = name;
    }

    public void work() {
        System.out.println(this.name + " 在看门");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
