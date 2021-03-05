package com.company.LearnCollections;

import java.util.*;

public class LearnList {
    public static void main(String[] args) {
//        Collection: базовый интерфейс для всех коллекций и других интерфейсов коллекций
//        List: наследует интерфейс Collection и представляет функциональность простых списков

        List<String> list = new ArrayList<>();

        // ArrayList  добавление в список поэлементно и целым списком
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.addAll(new ArrayList<>(Arrays.asList("six", "seven", "eight", "nine", "ten")));
        Collections.sort(list);  // сортировка списка
        System.out.println("\nSorted collection:");
        for (String s : list) {
            System.out.print(s + "  ");
        }

        System.out.println("\nSize this collection: " + list.size());  // размер списка
        System.out.print("Output [0,5,9] items: ");  // достаем элемент по заданому индексу
        System.out.println(list.get(0) + "  " + list.get(5) + "  " + list.get(9));

        list.add("ten");
        System.out.println("Add one item \"ten\", size: " + list.size() + ", collections have:");
        for (Object s : list) {
            System.out.print(s + "  ");
        }
        System.out.println();   // индексы первого и последнего вхождения элемента в список
        System.out.println("Element \"ten\" have first index: " + list.indexOf("ten"));
        System.out.println("Element \"ten\" have last index: " + list.lastIndexOf("ten"));

        //езменяем данные по индексу
        System.out.println("Set elements with index 3 and 6 >>> \"eleven\"");
        list.set(3, "eleven");
        list.set(6, "eleven");
        System.out.println("My collection:");
        for (Object s : list) {
            System.out.print(s + "  ");
        }

        //удаляем элемент по индексу при этом метод возвращает данные
        System.out.println("\nRemove \"" + list.remove("five") + "\"");
        System.out.println("Remove \"" + list.remove(0) + "\"");
        System.out.println("Remove \"" + list.remove(0) + "\"");
        System.out.println("Size of collections: " + list.size());
        for (Object s : list) {
            System.out.print(s + "  ");
        }

        list.clear();  // очистить весь список
        System.out.println("\nSize after list.clear(): " + list.size());


        // LinkedList  добавление в список поэлементно и целым списком
        List<Student> linkedList = new LinkedList<>();

        linkedList.add(new Student(2,"Ivan"));
        linkedList.add(new Student(4,"Stepan"));
        linkedList.add(new Student(1,"Kiril"));
        linkedList.add(new Student(3,"Oleg"));
        linkedList.add(new Student(5,"Roman"));





        List<String> stack = new Stack<>();
        List<String> vector = new Vector<>();
        //List syncList = new Collections.synchronizedList(new ArrayList<>());
    }

    static class Student {
         int id;
         String name;

        public Student(int i,String n) {
            this.id = i;
            this.name= n;
        }
    }
}

