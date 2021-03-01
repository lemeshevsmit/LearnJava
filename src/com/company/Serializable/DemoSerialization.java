package com.company.Serializable;

import java.io.*;

class Sphere implements Serializable {

    // Внутренняя переменная - радиус шара
    private double radius;
    Figura count;
    transient int num;
    static  double pii = 3.14;

    // Методы доступа
    public double GetR() {
        return radius;
    }

    public void SetR(double radius) {
        this.radius = radius;
    }

    // Методы сериализации объекта данного класса
    public void SaveToFile(String filename)
            throws ClassNotFoundException, IOException {

        // 1. Создать экземпляр класса FileOutputStream - создать файловый поток
        FileOutputStream fOut = new FileOutputStream(filename);

        // 2. Создать экземпляр objOut класса ObjectOutputStream - поток записи объектов
        ObjectOutputStream objOut = new ObjectOutputStream(fOut);

        // 3. Записать текущий экземпляр this в поток objOut
        objOut.writeObject(this);

        // 4. Закрыть поток objOut
        objOut.close();

        // 5. Закрыть файловый поток
        fOut.close();
    }

    public Sphere ReadFromFile(String filename)
            throws ClassNotFoundException, IOException {

        // 1. Создать экземпляр класса FileInputStream
        FileInputStream fInput = new FileInputStream(filename);

        // 2. Создать экземпляр класса ObjectInputStream
        ObjectInputStream objInput = new ObjectInputStream(fInput);

        // 3. Прочитать данные из файла filename в экземпляр dObj
        Sphere dObj = (Sphere)objInput.readObject();

        // 4. Закрыть потоки
        objInput.close();
        fInput.close();

        // 5. Вернуть результат
        return dObj;
    }

    // Метод вычисления объема шара
    public double Volume() {
        if (radius > 0)
            return 4.0 / 3.0 * Math.PI*radius*radius*radius;
        return 0.0;
    }
}

public class DemoSerialization implements Serializable {

    public static void main(String[] args)
            throws ClassNotFoundException, IOException {

        // 1. Записать экземпляр класса Sphere в файл "myfile.dat"
        // 1.1. Создать экземпляр sp
        Sphere sp = new Sphere();
        Figura fff = new Figura();
        fff.number = 5;
        sp.count = fff;

        // 1.2. Установить радиус
        sp.SetR(25.5);
        sp.count.number = 1;
        sp.num = 2;
        // 1.3. Записать sp в файл
        sp.SaveToFile("myfile.dat");

        // 2. Прочитать ранее записанный экземпляр из файла
        // 2.1. Объявить новую ссылку sp2 типа Sphere
        Sphere sp2 = new Sphere();

        // 2.2. Прочитать sp2
        sp2 = sp2.ReadFromFile("myfile.dat");

        // 2.3. Вывести значение в sp2
        System.out.println("sp2.radius = " + sp2.GetR());
        System.out.println("sp2.count = " + sp2.count.number);
        System.out.println("sp2.num = " + sp2.num);
        System.out.println("sp2.pii = " + sp2.pii);
    }
}

class Figura implements Serializable {
    int number;
}