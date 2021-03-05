package com.company.LearnCollections;

import java.util.*;

public class LearnList {

    static int deleteInLinkedList ( LinkedList<Student> ll, String str){
        int count=0;
        for (Student student: ll) {
            if (student.name.equals(str))  return count;
            count++;
        }
        return -1;
    }

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
        LinkedList<Student> linkedList = new LinkedList<>();

        linkedList.add(new Student(2,"Ivan"));
        linkedList.addFirst(new Student(4,"Stepan"));
        linkedList.offer(new Student(1,"Kiril"));
        linkedList.addLast(new Student(3,"Oleg"));
        linkedList.offerFirst(new Student(5,"Roman"));

        System.out.println("\n*************LinkedList************");
        System.out.println("My collection:");
        for (Student student : linkedList) {
            System.out.println(student.id +" "+ student.name);
        }
        System.out.println("Sorted collection:");
        Collections.sort(linkedList);
        for (Student student : linkedList) {
            System.out.println(student.id +" "+ student.name);
        }

        System.out.println("Get [get(0)] item: "+linkedList.get(0).name);
        System.out.println("Get [get(3)] item: "+linkedList.get(3).name);
        System.out.println("Get [get(linkedList.size()-1)] item: "+linkedList.get(linkedList.size()-1).name);
        System.out.println("Get [getFirst()] item: "+linkedList.getFirst().name);
        System.out.println("Get [getLast()] item: "+linkedList.getLast().name);
        System.out.println("Get [element()] item: "+linkedList.element().name);
        System.out.println("Get [peek()] item: "+linkedList.peek().name);
        System.out.println("Get [peekLast()] item: "+linkedList.peekLast().name);
        System.out.println("Get [peekFirst()] item: "+linkedList.peekFirst().name);
        System.out.println();

        Student st = new Student(0,"Sveta");
        linkedList.set(0,new Student(7,"Sasha"));
        linkedList.set(2,st);
        st.id=7;
        st.name="Svetlana";
        linkedList.set(linkedList.size()-1,st);
        for (Student student : linkedList) {
            System.out.println(student.id +" "+ student.name);
        }

        System.out.println("Svetlana last in: "+linkedList.lastIndexOf(st));
        System.out.println("Svetlana first in: "+linkedList.indexOf(st));

        //System.out.println("Remove [deleteInLinkedList] item: "+linkedList.remove(deleteInLinkedList(linkedList,"Svetlana")).name);
        System.out.println("Remove [removeLast()] item: "+linkedList.removeLast().name);
        System.out.println("Remove [removeFirst()] item: "+linkedList.removeFirst().name);
        System.out.println("Remove [poll()] item: "+linkedList.poll().name);
        System.out.println("Remove [pollFirst()] item: "+linkedList.pollFirst().name);
        System.out.println("Remove [remove(0)] item: "+linkedList.remove(0).name);
        System.out.println("Size: " + linkedList.size());

        System.out.println("\n*************Stack************");
        Stack<String> stack = new Stack<>();

        stack.add("A");
        stack.add("D");
        stack.add("B");
        stack.add("C");
        stack.push("E");
        stack.push("K");
        stack.push("F");
        stack.push("S");
        stack.add("M");

        for (String s:stack){
            System.out.print(s + "  " );
        }
        System.out.println();

        Collections.sort(stack);
        for (String s:stack){
            System.out.print(s + "  " );
        }
        System.out.println();

        System.out.println("Peek: "+stack.peek());
        System.out.println("Peek: "+stack.peek());
        for (String s:stack){
            System.out.print(s + "  " );
        }
        System.out.println();

        System.out.println("Pop: "+stack.pop());
        System.out.println("Pop: "+stack.pop());
        for (String s:stack){
            System.out.print(s + "  " );
        }
        System.out.println();
        System.out.println("Index C: "+Collections.binarySearch(stack,"C"));
        System.out.println("Index C: "+stack.indexOf("C"));


        System.out.println("\n*************Vector************");
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("D");
        vector.add("C");
        vector.add("B");
        vector.add("E");
        vector.add("G");
        vector.add("F");

        String[] s = new String[vector.size()];
        s= vector.toArray(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print (s[i] + "  ");
        }
        System.out.println();
        List<String> v = Arrays.asList(s);
        Collections.sort(v);
        for(String sss: v){
            System.out.print(sss+ "  ");
        }
        System.out.println();
        System.out.println(vector);
        System.out.println(v);
        System.out.println(v.equals(s));

        //List syncList = new Collections.synchronizedList(new ArrayList<>());
    }

    static class Student implements Comparable{
         int id;
         String name;

        public Student(int i,String n) {
            this.id = i;
            this.name= n;
        }

        @Override
        public int compareTo(Object o) {
            return id - ((Student)o).id;
        }


    }
}

