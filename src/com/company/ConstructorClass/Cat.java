package com.company.ConstructorClass;

public class Cat extends Animal{  // класс Cat наследееться от класса Animal

    private String name;   // поля класса Cat
    private String color;

    public Cat() {   //конструктор по умолчанию модификатор public
        super();      //вызов родительского конструктора
    }
    private Cat(String name) {  // конструктор с одним параметром модификатор private
        this.name = name;
    }
    protected Cat(String name, String color){    // конструктор с двумя параметрами модификатор protected
        this(name);  // вызов конструктора с одним параметром
        this.color=color;
    }

    @Override
    public void display() {  }   // переопределение метода

    //Сеттеры и Геттеры для наших полей
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }
    public String getColor(){ return color; }
    public void setColor(String color){ this.color = color; }

}