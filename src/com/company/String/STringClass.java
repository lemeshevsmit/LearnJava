package com.company.String;

public class STringClass {
    public static void main(String[] args) {
// сравнение строк
        boolean b;
        String s1, s2;
        s1 = "Text";
        s2 = "Text";

// операция сравнения ==
        b = s1 == s2; // b = true
        b = s1 == "TEXT"; // b = false

// метод equals()
        b = s1.equals(s2); // b = true
        b = s1.equals("TEXT"); // b = false

// метод equalsIgnoreCase()
        s1 = "Java Eclipse";
        s2 = "JAVA ECLIPSE";
        b = s1.equalsIgnoreCase("JAVA ECLIPSE"); // b = true
        b = s2.equalsIgnoreCase(s1); // b = true


// метод charAt()
        String s = "Java Eclipse";
        char c;
        c = s.charAt(0); // c = 'J'
        c = s.charAt(1); // c = 'a'
        c = s.charAt(2); // c = 'v'
        c = s.charAt(3); // c = 'a'

// метод codePointAt()
        int n;
        n = s.codePointAt(0); // n = 74 - код символа 'J'
        n = s.codePointAt(5); // n = 69 - код символа 'E'
        System.out.println(s.codePointAt(4));// 32 - пробел

// метод codePointBefore()
        n = s.codePointBefore(3); // n = 118 - код символа 'v'
        n = s.codePointBefore(1); // n = 74 - код символа 'J'

// ошибка: "String index out of range: 0"
// n = s.codePointBefore(0);

// метод compareTo()
        s1 = "Java Eclipse";
        s2 = "";
        n = s1.compareTo(s2); // n = 12
        n = s1.compareTo("Java"); // n = 8
        n = s2.compareTo("T"); // n = -1

// метод compareToIgnoreCase()
        n = s1.compareToIgnoreCase("java ECLIPSE"); // n = 0, строки равны

// метод concat()
        s = "Hello ";
        s = s.concat("world"); // s = "Hello world"
        s = s.concat("!");     // s = "Hello world!"

// операция '+'
        s = "Hello ";
        s = s + "world"; // s = "Hello world"
        s = s + "!";  // s = "Hello world!"

// метод contains()
        s1 = "Java Eclipse";
        s2 = "Eclipse";
        b = s1.contains(s2); // b = true
        b = s2.contains("eclipse"); // b = false

// метод endsWith()
        s1 = "Java Eclipse";
        s2 = "Eclipse";
        b = s1.endsWith("Ecl");  // b = false
        b = s2.endsWith(s1);     // b = false
        b = s1.endsWith(s2);     // b = true
        b = s1.endsWith("Java"); // b = false
        b = s1.endsWith("ipse"); // b = true

// метод getBytes()
        byte[] cc;
        s = "Java Eclipse";
        cc = s.getBytes(); // cc = { 74, 97, 118, 97 } - коды символов слова "Java"

// метод indexOf()
        s = "Java Eclipse";

// 1-й вариант метода
        n = s.indexOf(118); // d = 2, позиция символа с кодом 118 - символа 'v'
        n = s.indexOf(130); // d = -1, символа с кодом 130 нет в строке s
        n = s.indexOf(74); // d = 0

// 2-й вариант метода - позиция первого вхождения подстроки
        n = s.indexOf("ava"); // d = 1
        n = s.indexOf("abs"); // d = -1, вхождений нет

// метод isEmpty()
        s = "Java Eclipse";
        b = s.isEmpty(); // b = false
        s = "";
        b = s.isEmpty(); // b = true

// операция '=='
        b = s==""; // b = true
        s = "Java";
        b = s==""; // b = false

 //метод lastIndexOf()
        s = "Java";
        n = s.lastIndexOf(97); // d = 3, последнее вхождение символа с кодом 97 - 'a'
        n = s.indexOf(97); // d = 1, первое вхождение символа с кодом 97
        n = s.lastIndexOf("va"); // d = 2
        n = s.lastIndexOf("a");  // d = 3

// метод replace()
        s = "TextTextText";

// замена одного символа
        s2 = s.replace('T', 'X'); // s2 = "XextXextXext"

// замена одного текста на другой
        s2 = s.replace("T", "TT"); // s2 = "TTextTTextTText"
        s2 = s.replace("Text", "ABC"); // s2 = "ABCABCABC"

// метод replaceFirst()
        s2 = s.replaceFirst("Te", "ABC"); // s2 = "ABCxtTextText"

// метод startsWith()
        s = "TextTextText";
        b = s.startsWith("Te");  // b = true
        b = s.startsWith("ext"); // b = false

// метод substring()
// вариант 1
        s = "This is a text";
        s2 = s.substring(2); // s2 = "is is a text"

// вариант 2
        s2 = s.substring(2,3);  // s2 = "i"
        s2 = s.substring(2,4);  // s2 = "is"
        s2 = s.substring(6,13); // s2 = "s a tex"

// метод toCharArray()
        char[] ccc;
        s = "Java";
        ccc = s.toCharArray(); // ccc = { 'J', 'a', 'v', 'a' }

// метод copyValueOf()
        s="";
        s = String.copyValueOf(ccc); // s = "Java"

// метод valueOf()
// тип double
        double d;
        d = 3.8567;
        s = String.valueOf(d); // s = "3.8567"

// тип int
        n = -3903;
        s = String.valueOf(n); // s = "-3903"

// тип char
        c = '+';
        s = String.valueOf(c); // s = "+"

// тип boolean
        b = true;
        s = String.valueOf(b); // s = true

// метод toLowerCase()
        s1 = "Java Eclipse";
        s2 = s1.toLowerCase(); // s2 = "java eclipse"
        s2 = s1.toUpperCase(); // s2 = "JAVA ECLIPSE"


    }
}
