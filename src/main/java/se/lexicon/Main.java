package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/// Small calculator for java that can do addition, subtraction, multiplication and division.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and welcome to the friendly calculator");
        System.out.println("What operation for calculation do you like to use?");

        boolean toContinue=false;
        do {
            System.out.println("\nOptions:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. End Program");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("What two numbers do you like to add together?");
                    float a = scanner.nextFloat();
                    System.out.println(" and ");
                    float b = scanner.nextFloat();
                    System.out.println(a + " + " + b + " = " + MathOperation.addition(a, b));

                    System.out.println("Would you like to make another calculation? (y/n?)");
                    String input01 = scanner.next();

                if(input01.equalsIgnoreCase("n")) {
                    toContinue = false;
                       break;
                    } else if (input01.equalsIgnoreCase("y")){
                        toContinue = true;
                        break;
                    }

                case 2:
                    System.out.println("What two numbers do you like to subtrack from another?");
                    float c = scanner.nextFloat();
                    System.out.println(" and ");
                    float d = scanner.nextFloat();
                    System.out.println(c + " - " + d + " = " + MathOperation.subtraction(c, d));

                    System.out.println("Would you like to make another calculation? (y/n?)");
                    String input02 = scanner.next();

                    if(input02.equalsIgnoreCase("n")) {
                        toContinue = false;
                        break;
                    } else if (input02.equalsIgnoreCase("y")){
                        toContinue = true;
                        break;
                    }

                case 3:
                    System.out.println("What two numbers do you like to multiplay with one another?");
                    float e = scanner.nextFloat();
                    System.out.println(" and ");
                    float f = scanner.nextFloat();
                    System.out.println(e + " * " + f + " = " + MathOperation.multiplication(e, f));

                    System.out.println("Would you like to make another calculation? (y/n?)");
                    String input03 = scanner.next();

                    if(input03.equalsIgnoreCase("n")) {
                        toContinue = false;
                        break;
                    } else if (input03.equalsIgnoreCase("y")){
                        toContinue = true;
                        break;
                    }

                case 4:
                    System.out.println("What number do you like to divide with another?");
                    float g = scanner.nextFloat();
                    System.out.println(" and ");
                    float h = scanner.nextFloat();
                    System.out.println(g + " / " + h + " = " + MathOperation.div(g, h));

                    System.out.println("Would you like to make another calculation? (y/n?)");
                    String input04 = scanner.next();

                    if(input04.equalsIgnoreCase("n")) {
                        toContinue = false;
                        break;
                    } else if (input04.equalsIgnoreCase("y")){
                        toContinue = true;
                        break;
                    }

                case 5:
                    System.out.println("You have ended the program and ordered a Pizza!");
                    toContinue = false;
                    break;


            }

        } while (toContinue);





    }
}