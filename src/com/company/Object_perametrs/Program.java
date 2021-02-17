package com.company.Object_perametrs;

public class Program {

    public static void main(String[] args) {

        Person kate = new Person("Kate");
        System.out.println(kate.getName());     // Kate
        changePerson(kate);
        System.out.println(kate.getName());     // Kate - изменения не произошло
        // kate хранит ссылку на старый объект
        changeName(kate);
        System.out.println(kate.getName());

        System.out.println(changePer(kate).getName());
        System.out.println(kate.getName());

    }

    static void changePerson(Person p) {
        p = new Person("Alice");    // p указывает на новый объект
        p.setName("Ann");
    }

    static void changeName(Person p) {
        p.setName("Alice");
    }

    static Person changePer(Person p) {
        p = new Person("Tany");    // p указывает на новый объект
        p.setName("Ann");
        return p;
    }
}

class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return this.name;
    }
}