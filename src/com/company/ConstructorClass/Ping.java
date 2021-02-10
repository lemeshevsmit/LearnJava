package com.company.ConstructorClass;

public class Ping extends Animal{

    private String name;
    private String color;
    private int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    Ping(String name, int age, String color, String info) {
        super(name, age, color, info);
    }

    Ping(String name, int age, String color) {
        this.name = name;
        this.color= color;
        this.age =  age;
    }


    @Override
    public void display() {
        System.out.println("Свинья по имени: " + name + "\nЦвета: "+ color+ "\nВозраста: "+ age);
        System.out.println("Свинья по имени: " + super.getName() + "\nЦвета: "+ super.color+ "\nВозраста: "+ super.age);
        System.out.println("ping method display ends\n");
    }
}
