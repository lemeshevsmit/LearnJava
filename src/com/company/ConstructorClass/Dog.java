package com.company.ConstructorClass;

class Dog{

    private String name;
    private String poroda;
    private int age;

    public Dog(String nameDog, String porodaDog){  //конструктор с 2-я параметрами
            name = nameDog;
            poroda = porodaDog;
    }
    public Dog(String nameDog, String porodaDog, int age){  // конструктор с 3 параметрами
    this(nameDog,porodaDog);  // вызов конструктора с 2-я параметрами
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPoroda() {
        return poroda;
    }

    public int getAge() {
        return age;
    }
}
