package com.company.LearnCollections;

import java.util.*;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<String> linkedQueue = new LinkedList<>();
        Queue<String> priorityQueue = new PriorityQueue<>();
        Deque<String>  linkedDeque = new LinkedList<>();
        Deque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.add("A");
        arrayDeque.add("D");
        arrayDeque.add("C");
        arrayDeque.add("B");
        arrayDeque.add("E");
        for (String s : arrayDeque) {
            System.out.println(s);
        }

        System.out.println("*********************************************");
        priorityQueue.add("A");
        priorityQueue.add("D");
        priorityQueue.add("C");
        priorityQueue.add("B");
        priorityQueue.add("E");
        for (String s : priorityQueue) {
            System.out.println(s);
        } System.out.println(priorityQueue.size());
        System.out.println("****************************************");
        while (priorityQueue.size()!=0) {
            System.out.println(priorityQueue.remove());
        }
        System.out.println(priorityQueue.size());
    }
}
