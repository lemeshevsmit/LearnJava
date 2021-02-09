package com.company.ConstructorClass;
import java.util.*;
public class ConstructorClass {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Мурчик");
        cat.setColor("рижий");
        Dog dog = new Dog("Шарик","Пикинес",1);
        System.out.println("Кот по имени: " + cat.getName() + "\nЦвета: "+ cat.getColor()+"\n");

        System.out.println("Пес по имени: " + dog.getName() + "\nПорода: "+ dog.getPoroda()+ "\nВозраст: "+dog.getAge());
    }

}
