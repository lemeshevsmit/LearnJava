package com.company.ConstructorClass;
import java.util.*;
public class ConstructorClass {
    public static void main(String[] args) {
//        Cat cat = new Cat();    //Обьект без параметров
//        cat.setName("Мурчик");
//        cat.setColor("рижий");
//        Dog dog = new Dog("Шарик","Пикинес",1);  // обьект с параметрами
//        System.out.println("Кот по имени: " + cat.getName() + "\nЦвета: "+ cat.getColor()+"\n");
//        System.out.println("Пес по имени: " + dog.getName() + "\nПорода: "+ dog.getPoroda()+ "\nВозраст: "+dog.getAge());
//        System.out.println("********************************************");
        Animal an = new Animal("Name animal",4,"white","this is animal") {
            @Override
            public void display() {
                System.out.println("Animal class object display");
                System.out.println("Animal name:");
                System.out.println(getName());
                super.setName("Жираф");
                System.out.println(getName());
                System.out.println("Animal color:");
                System.out.println(super.color);
                System.out.println(color="Желтый");
                System.out.println("Animal age:");
                System.out.println(super.age);
                System.out.println(age=5);
                System.out.println("Animal info:");
                System.out.println(super.info);
                System.out.println(info = "this is big animal");
            }
        };
        an.display();
        System.out.println("Animal methods:");
        an.GetInfo();
        an.GetInfoProtect();
        an.GetInfoPublic();
        System.out.println("*********************************");

        Ping ping1 = new Ping("Пятачок",2,"розовый");
        ping1.display();
        ping1.GetInfoPublic();
        ping1.GetInfo();
        ping1.GetInfoProtect();
        System.out.println("********************************");

        Ping ping2 = new Ping("Свинтус",1,"розовo-белый","потомок Пяточка");
        ping2.display();
        ping2.GetInfoPublic();
        ping2.GetInfo();
        ping2.GetInfoProtect();
        System.out.println("********************************");

        Animal ping3 = new Ping("Свинят",1,"чёрный","потомок Пяточка");
        ping3.display();
        ping3.GetInfoPublic();
        ping3.GetInfo();
        ping3.GetInfoProtect();
    }

}
