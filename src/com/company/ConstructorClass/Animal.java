package com.company.ConstructorClass;

public abstract class Animal {
    private String name;
    public  int age;
    protected String color;
    String info;

    Animal(String name, int age, String color, String info){
        this.name = name;
        this.age = age;
        this.color=color;
        this.info = info;
    }

    protected Animal() {
        GetInfoPrivate();
    }

    public abstract void display();

    protected void GetInfoProtect()
    {
        System.out.println("This is protected animal method");
        info = "protected animal";
        System.out.println(name + " info: "+info);
    }

    public void GetInfoPublic()
    {
        System.out.println("This is public animal method");
        info = " public animal";
        System.out.println(name + " info: "+info);
    }
    private void GetInfoPrivate()
    {
        System.out.println("This is private animal method");
        info = " private animal";
        System.out.println(name + " info: "+info);
    }

     void GetInfo()
    {
        System.out.println("This is default animal method");
        info = " default animal";
        System.out.println(name+" info: "+info);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
