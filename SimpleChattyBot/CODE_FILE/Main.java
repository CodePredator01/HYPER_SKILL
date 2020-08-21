/*
 * Created by IntelliJ IDEA.
 * User: Priyanshu (CodePredator01)
 * Date: 21-08-2020
 * Time: 12:51 PM
 * File: Main.java
 * */


import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2020"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantname, String birthYear) {
        System.out.println("Hello! My name is " + assistantname + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + yourAge + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int count = scanner.nextInt();
        for (int indexNumber = 0; indexNumber <= count; indexNumber++) {
            System.out.println(indexNumber + "!");
        }
        System.out.println("Completed, have a nice day!");
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int correctOption = 2;
        int yourOption = scanner.nextInt();
        while (yourOption != correctOption) {
            System.out.println("Please, try again.");
            yourOption = scanner.nextInt();
        }
    }

    static void end() {
        System.out.println("Completed, have a nice day!");
        System.out.println("Congratulations, have a nice day!");
    }
}
