package com.company.File;

import java.io.*;

public class Work_with_files {
    public static void main(String[] args) throws IOException {
//        File file1 = new File("src/com/company/File/text_file.txt");
//        if (!file1.exists()) file1.createNewFile();
//        FileReader fileReader1 = new FileReader(file1);
//        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
//        while (bufferedReader1.ready()) {
//            System.out.println(bufferedReader1.readLine());
//        }
//        File file2 = new File("src/com/company/File/html_text.html");
//        if (!file2.exists()) file2.createNewFile();
//        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
//        while (bufferedReader2.ready()) {
//            System.out.println(bufferedReader2.readLine());
//        }
//        String path1 = file1.getPath();
//        System.out.println("\n**************************************\n" + path1);


//        2. Метод getName(). Получить имя файла или каталога
//        3. Метод getPath(). Получить имя файла
//        4. Метод isAbsolute(). Определить, указан ли полный путь к файлу
//        5. Метод getAbsolutePath(). Получить полный путь к файлу
//        6. Методы canRead(), canWrite(). Определение того, допускает ли файловый объект чтение и запись
//        7. Метод exists(). Определение наличия файла (каталога)
//        8. Метод isDirectory(). Определить, связан ли файловый объект с директорием
//        9. Метод isFile(). Определить, связан ли файловый объект с файлом
//        10. Метод isHidden(). Определить, есть ли файловый объект скрытым
//        11. Метод length(). Определить размер в байтах файла, который связан с файловым объектом
//        12. Метод delete(). Удаление файла
//        13. Метод mkdir(). Создание папки или каталога
//        14. Метод mkdirs(). Создание нескольких вложенных папок
//        15. Метод renameTo(). Переименование файла
//        16. Метод getTotalSpace(). Определение объема диска
//        17. Метод getFreeSpace(). Определить свободное место на диске
//        18. Метод getUsableSpace(). Определение полезного места на диске

// Объявить файловый объект и связать его с именем файла
        File f = new File("D:\\Program Files");

// Метод getPath() - получить полный путь к файлу
        String path2 = f.getPath(); // path2 = "C:\\Program Files"
        System.out.println("path2 = " + path2);

// Метод getName() - получить имя файла
        String name = f.getName(); // name = "Program Files"
        System.out.println("name = " + name);

// Метод isAbsolute() - задан ли полный путь к файлу (каталогу)
// Объявить файловый объект и связать его с именем файла
        File f1 = new File("output.txt"); // задан сокращенный путь
        boolean res1 = f1.isAbsolute();
        System.out.println("res1 = " + res1); // res1 = false

// Задать полное имя при создании файлового объекта
        boolean res2 = f.isAbsolute();
        System.out.println("res2 = " + res2); // res2 = true

// Метод getAbsolutePath() - получить полный путь к файлу
// Объявить файловый объект и связать его с именем файла
        String absPath = f1.getAbsolutePath();
        System.out.println("Path = " + absPath);

        if (f.canRead())
            System.out.println("The result of canRead() is true.");
        else
            System.out.println("The result of canRead() is false");

        if (f.canWrite())
            System.out.println("The result of canWrite() is true.");
        else
            System.out.println("The result of canWrite() is false");

// Метод exists() - определить, существует ли файл (директорий)
// Объявить файловый объект и связать его с именем файла
// Если файл f существует, то вывести соответствующее сообщение
        if (f1.exists())
            System.out.println("File is present.");
        else
            System.out.println("File is not present"); // файл отсутствует

// Определить, существует ли каталог
        if (f1.exists())
            System.out.println("The directory is present.");
        else
            System.out.println("The directory is not present.");

// Определить размер файла в байтах
// 1. Объявить файловую переменную  у нас есть f1
// 2. Создать поток, который записывает символы в файл f
        FileWriter fw = new FileWriter(f1);
// 3. Записать в файл строку "Hello world!"
        fw.write("Hello world!");
// 4. Закрыть поток
        fw.close();
// 5. Определить длину файла "abc.txt"
        long len = f1.length();
// 6. Вывести длину файла на консоль
        System.out.println("len = " + len); // len = 12

// Метод isDirectory - определить, есть ли файл директорием (папкой)
// 1. Объявить файловую переменную и связать ее именем файла или папки
// Если файл f существует, то определить его тип
        if (f1.exists()) {
            if (f.isDirectory()) {   ////isFile() - для файлов;  isHidden() - для скрытости
                System.out.println("Directory.");
            }
            else
                System.out.println("File.");
        }
        else
            System.out.println("The file is not present"); // файл отсутствует

// Метод delete() - удалить файл по его имени
// Объявить файловую переменную
// Удалить файл, если он существует
        if (f1.exists()) {
            f1.delete();
            System.out.println("The file is deleted.");
        }
        else
            System.out.println("The file is not present.");

// Создать папки по указанному пути
//      File f2 = new File("D:\\ABC\\DEF\\GHI");
// Создать папки D:\ABC, D:\ABC\DEF, D:\ABC\DEF\GHI
//        if (f2.mkdirs())
//            System.out.println("The folders is created.");
//        else
//            System.out.println("The folders is not created");

// Определить размер диска
        File f3 = new File("C:\\");
// Определить общий объем жесткого диска E:
        long totalSpace = f3.getTotalSpace();
        System.out.println("\nDrive C: - Total space GB= " + (double)totalSpace/(1024*1024*1024));
        long freeSpace = f3.getFreeSpace();
        System.out.println("Drive C: - Free space GB= " + (double)freeSpace/(1024*1024*1024));
// Определить объем диска C:
        f3 = new File("D:\\Videos");
        totalSpace = f3.getTotalSpace();
        System.out.println("\nDrive D: - Total space GB= " + (double)totalSpace/(1024*1024*1024));
        freeSpace = f3.getUsableSpace();
        System.out.println("Drive D: - Free space GB= " + (double)freeSpace/(1024*1024*1024));

        f.delete();
        f1.delete();
    }
}

