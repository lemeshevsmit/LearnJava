package com.company.ConstructorClass;

class Dog{

    private String name;    // поля класса Dog
    private String poroda;
    private int age;

    public Dog(String nameDog, String porodaDog){  //конструктор с 2-мя параметрами
            name = nameDog;
            poroda = porodaDog;
    }
    public Dog(String nameDog, String porodaDog, int age){  // конструктор с 3-мя параметрами
    this(nameDog,porodaDog);  // вызов конструктора с 2-мя параметрами
        this.age = age;
    }
    //Сеттеры и Геттеры для наших полей
    public String getName() { return name; }
    public String getPoroda() { return poroda; }
    public int getAge() { return age; }
}
