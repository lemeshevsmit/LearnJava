package com.company.Exeption;

public class Exeptionss {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static void main(String[] args) {

        try {
            int result = getFactorial(-6);
            System.out.println("Program is correct");
            System.out.println(result);
        } catch (FactorialException ex) {
            System.out.println("Program not correct");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            System.exit(0);
        } finally {
            System.out.println(ANSI_GREEN+"Block finally: Good job!!"+ANSI_RESET);
        }
    }

    public static int getFactorial(int num) throws FactorialException {

        if (num < 1) throw new FactorialException(num);

        int result = 1;
        for (int i = 1; i <= num; i++) {

            result *= i;
        }
        return result;
    }

    static class FactorialException extends Exception {

        private int number;

        public int getNumber() {
            return number;
        }

        public FactorialException() {
        }

        public FactorialException(int num) {
            super("The number must be less than 1 " + "but your number is: " + num);
            number = num;
        }
    }
}

