package com.company.ConstructorClass;

public class Ping extends Animal{   // наследуемый класс

    private String name;   // поля класса
    private String color;
    private int age;

    //переопределенные гетттеры и сеттеры
    @Override
    public String getName() { return name; }
    @Override
    public void setName(String name) { this.name = name; }

    Ping(String name, int age, String color, String info) {  // конструктор вызывает родительский
        super(name, age, color, info);
    }

    Ping(String name, int age, String color) {  // конструктор класса Ping
    //super(name,age,color,"");   // для вызова родительского
        this.name =name;
        this.age= age;
        this.color=color;
    }

    public void  displayPing(){  // метод класса Ping
        System.out.println("Свинья по имени: " + name + "\nЦвета: "+ color+ "\nВозраста: "+ age);
    }

    @Override
    public void display() {  // переопределенный метод родительского класса
        System.out.println("Свинья по имени: " + super.getName() + "\nЦвета: "+ super.color+ "\nВозраста: "+ super.age);
    }
}
