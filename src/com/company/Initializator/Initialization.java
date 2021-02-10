package com.company.Initializator;

import com.company.ConstructorClass.Cat;

public class Initialization extends Person{
    static{
        System.out.println("Блок инициализации Main static");
        Person undef = new Person();
        undef.displayInfo();
    }
    public static void main(String[] args) {

        Person tom = new Person("Tom");
        tom.displayInfo();

        newPerson();
        Student st1 = new Student("Max", 16,1);
        st1.displayInfo();
    }

}

class Person{
    static  String info;
    String name;    // имя
    int age;        // возраст
    /*начало блока инициализатора static*/
    static{
        System.out.println("Блок инициализации person static");
        Person oliver = new Person("Oliver",33);
        oliver.displayInfo();
    } /*конец блока инициализатора static*/
    /*начало блока инициализатора*/
    {
        System.out.println("Блок инициализации person");
        name = "Undefined";
        info = "no information";
        age = 18;
    }
    /*конец блока инициализатора*/
    Person(){ }

    Person(String name){
        this.name = name;
        info = "name of person";
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
        info = "full information about person";
    }
    void displayInfo(){
        System.out.printf("\tName: %s \n\tAge: %d \n\tInfo: %s \n", name, age,info);
    }

    static void newPerson (){
        Person din = new Person("Din",25);
        din.displayInfo();
    }
}

class Student extends Person
{
    private int cours;
    static {
        System.out.println("Блок инициализации static student");
        Student st0 = new Student("Oleg", 17,1);
        st0.displayInfo();
    }

    {
        System.out.println("Блок инициализации student");
        info="information about student";
    }
    Student(String name, int age, int cours){
        super(name, age);
        this.cours= cours;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.printf("\tCourse: %d \n", cours);

    }
}