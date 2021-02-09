package com.company.ConstructorClass;

class Dog{

    private String name;
    private String poroda;
    private int age;

    public Dog(String nameDog, String porodaDog, int ageDog){
        name = nameDog;
        poroda = porodaDog;
        age = ageDog;
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
