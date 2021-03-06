package com.company.LearnCollections;
import java.util.*;

public class LearnSet {
    public static void main(String[] args) {
        Set<LearnList.Student> hashSet = new HashSet<>(3,0.8f);
        Set<LearnList.Student> linkSet = new LinkedHashSet<>(3,0.6f);
        TreeSet<LearnList.Student> treeSet = new TreeSet<>();

        System.out.println("*******************HashSet******************");
        hashSet.add(new LearnList.Student(2,"Ivan"));
        hashSet.add(new LearnList.Student(3,"Stepan"));
        hashSet.add(new LearnList.Student(1,"Kiril"));
        hashSet.add(new LearnList.Student(4,"Sasha"));
        hashSet.add(new LearnList.Student(6,"Oleg"));
        hashSet.add(new LearnList.Student(7,"David"));
        hashSet.add(new LearnList.Student(5,"Maxim"));
        for (LearnList.Student s : hashSet) {
            System.out.println("ID: "+ s.id + " Name: " +s.name);
        }

        System.out.println("*****************LinkedHashSet***************");
        linkSet.add(new LearnList.Student(2,"Ivan"));
        linkSet.add(new LearnList.Student(3,"Stepan"));
        linkSet.add(new LearnList.Student(1,"Kiril"));
        linkSet.add(new LearnList.Student(4,"Sasha"));
        linkSet.add(new LearnList.Student(6,"Oleg"));
        linkSet.add(new LearnList.Student(7,"David"));
        linkSet.add(new LearnList.Student(5,"Maxim"));
        for (LearnList.Student s : linkSet) {
            System.out.println("ID: "+ s.id + " Name: " +s.name);
        }

        System.out.println("*****************TreeSet***************");
        treeSet.add(new LearnList.Student(2,"Ivan"));
        treeSet.add(new LearnList.Student(3,"Stepan"));
        treeSet.add(new LearnList.Student(1,"Kiril"));
        treeSet.add(new LearnList.Student(4,"Sasha"));
        treeSet.add(new LearnList.Student(6,"Oleg"));
        treeSet.add(new LearnList.Student(7,"David"));
        treeSet.add(new LearnList.Student(5,"Maxim"));
        for (LearnList.Student s : treeSet) {
            System.out.println("ID: "+ s.id + " Name: " +s.name);

        }

    }

}
