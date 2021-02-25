package com.company.InnerNested;

public class InnerNested {
    public static void main(String[] args) {

        OutClass oc = new OutClass(); // создать объект класса OutClass
        int t = oc.outD;
        System.out.println("Внешний класс: " + t);

        // вызов конструкции .new для создания объекта вложенного класса
        OutClass.InClass inc = oc.new InClass();
        t = inc.inD;
        System.out.println("Нестатический внутренний класс: " + t);

        // вызов конструкции .new для создания объекта вложенного вложенного класса
        OutClass.InClass.InINClass ininc = inc.new InINClass();
        t = ininc.inIND;
        System.out.println("Нестатический внутренний нестатический вложенный класс: " + t);

        // создание статического вложеного в нестатический вложений класс невозможно
        System.out.println("Нестатический внутренний вложенный статический класс: NULL");

        // создать объект вложенного статического public-класса OutClass.InClass1()
        OutClass.InClass1 isc = new OutClass.InClass1();
        t = isc.inSD;
        System.out.println("Статический внутренний класс: " + t);

        // создать объект вложенного вложенного нестатического класса OutClass.InClass1.InNonStaticClass1()
        OutClass.InClass1.InInNonStaticClass1 isnc = isc.new InInNonStaticClass1();
        t = isnc.inSND;
        System.out.println("Статический внутренний вложенный нестатический класс: " + t);

        // создать объект вложенного вложеного статического InInStaticClass1
        OutClass.InClass1.InInStaticClass1 issc = new OutClass.InClass1.InInStaticClass1();
        t = issc.inSSD;
        System.out.println("Статический внутренний вложенный статический класс: " + t);

        // создать объект вложенного (no)статического private-класса - запрещено
        // через метод GetInterfaceInClass получить объект InClass2
        // OutClass.InClass2 ic2 = new OutClass.InClass2(); //- ошибка
        InterfaceInClass ic2 = oc.GetInterfaceInClass();
        t= ic2.method1();
        System.out.println("Доступ к приватному вложеному классу через метод интерфейса: " + t);
    }
}

// охватывающий нестатический класс
class OutClass {
    int outD;

    //Constructor OutClass
    OutClass() {
        outD = 111;
    }

    // вложенный нестатический класс
    class InClass {
        int inD;

        //Constructor InClass
        InClass() {
            inD = 222;
        }

        // вложенный нестатический класс
        class InINClass {
            int inIND;

            //Constructor InINClass
            InINClass() {
                inIND = 333;
            }
        }

        // вложенный статический класс создать не могу
    }

    // вложенный статический public-класс
    static class InClass1 {
        int inSD;

        //Constructor InClass1
        InClass1() {
            inSD = 555;
        }

        // вложенный нестатический класс
        class InInNonStaticClass1 {
            int inSND;

            //Constructor InNonStaticClass1
            InInNonStaticClass1() {
                inSND = 666;
            }
        }

        // вложенный статический public-класс
        static class InInStaticClass1 {
            int inSSD;

            //Constructor InStaticClass1
            InInStaticClass1() {
                inSSD = 777;
            }
        }
    }

    // вложенный статический private-класс
    private class InClass2 implements InterfaceInClass {
        int inSPD;

        //Constructor InClass2
        InClass2() {
            inSPD = 888;
        }

        public int method1() {
            return inSPD;
        }

    }

    // метод класса OutClass, возвращающий объект интерфейса InterfaceInClass
    public InterfaceInClass GetInterfaceInClass() {
        // некоторые инструкции (могут отсутствовать)
        return new InClass2(); // возвратить экземпляр класса InClass
    }
}
