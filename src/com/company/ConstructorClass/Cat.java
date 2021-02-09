package com.company.ConstructorClass;

public class Cat{

    private String name;
    private String color;

    public Cat() {   //конструктор по умолчанию
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

}