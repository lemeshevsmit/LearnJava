package com.company.ZadachaOOP;

import java.util.ArrayList;

public class OfficeWorker {
    static  ArrayList<OfficeWorker> workers = new ArrayList<OfficeWorker>();
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    private String firstName;
    private String lastName;
    private String secondName;

    public OfficeWorker(String firstName, String lastName, String secondName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
    }
    static {
        workers.add(0, new OfficeWorker("Ivanov","Ivan","Ivanovich"));
        workers.add(1, new OfficeWorker("Stepanov","Stepan","Stepanovich"));
        workers.add(2, new OfficeWorker("Kirilov","Kiril","Kirilovich"));
        workers.add(3, new OfficeWorker("Petrov","Ivan","Stepanovich"));
        workers.add(4, new OfficeWorker("Andropov","Oleg","Andreevich"));
        workers.add(5, new OfficeWorker("Nemesh","Taras","Olegovich"));
        workers.add(6, new OfficeWorker("Ivanov","Maksim","Ivanovich"));
        workers.add(7, new OfficeWorker("Bezdetnui","Aleksandr","Ivanovich"));
        workers.add(8, new OfficeWorker("Karapuzov","Oleg","Tarasovich"));
        workers.add(9, new OfficeWorker("Malushov","Andrie","Aleksandrovich"));
    }
}
