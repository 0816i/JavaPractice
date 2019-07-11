package org.dimigo.inheritance;

public class Person {
    private String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hello");
    }

    void sayBye() {
        System.out.println("Bye");
    }

    @Override
    public String toString() {
        return "저는 " + name + "입니다.";
    }
}
