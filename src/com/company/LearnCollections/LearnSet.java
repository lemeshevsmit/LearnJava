package com.company.LearnCollections;
import java.util.*;

public class LearnSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        System.out.println("*******************HashSet******************");
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        hashSet.add("five");
        hashSet.add("six");
        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println("*****************LinkedHashSet***************");
        linkSet.add("one");
        linkSet.add("two");
        linkSet.add("three");
        linkSet.add("four");
        linkSet.add("five");
        linkSet.add("six");
        for (String s : linkSet) {
            System.out.println(s);
        }

        System.out.println("*****************TreeSet***************");
        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");
        treeSet.add("four");
        treeSet.add("five");
        treeSet.add("six");
        for (String s : treeSet) {
            System.out.println(s);
        }
    }

}
