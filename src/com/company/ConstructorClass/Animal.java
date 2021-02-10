package com.company.ConstructorClass;

public abstract class Animal {   //абстрактний класс  к полями разных модификаторов
    private String name;        //поля класса
    public  int age;
    protected String color;
    String info;

    Animal(String name, int age, String color, String info){  //конструктор для 4-ох полей
        this.name = name;
        this.age = age;
        this.color=color;
        this.info = info;
    }

    protected Animal() {  //конструктор по умолчанию который видно в наследниках и здесь
    }

    public abstract void display();  // абстрактный метод

    protected void GetInfoProtect()  //метод для классов наследников
    {
        System.out.println("This is protected animal method");
        info = "protected animal";
        System.out.println(this.name + " info: "+info);
    }

    public void GetInfoPublic() //общий метод
    {
        System.out.println("This is public animal method");
        info = " public animal";
        System.out.println(name + " info: "+info);
    }
    private void GetInfoPrivate()   // метод только для класа Animal
    {
        System.out.println("я могу быть задеен в классе Animal");
    }

     void GetInfo()  // метод
    {
        System.out.println("This is default animal method");
        info = " default animal";
        System.out.println(name+" info: "+info);
    }
    //Сеттеры и Геттеры для наших полей
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
