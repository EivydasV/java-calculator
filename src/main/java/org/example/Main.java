package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person = getDetailsAboutPerson();
        multiplication(person.getName().length(), person.getSurname().length());
        calculator();
    }

    private static Person getDetailsAboutPerson(){
        System.out.println("task: 1");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = in.nextLine();

        System.out.println("Enter your your surname");
        String surname = in.nextLine();

        System.out.println("Enter your age");
        int age = in.nextInt();

        System.out.println("Enter your the average of your grades");
        float average = in.nextFloat();

        Person person = new Person(name, age, average, surname.charAt(0), surname);
        System.out.println(person);

        return person;
    }

    private static void multiplication(int nameLength, int surnameLength){
        System.out.println("task: 2");
        int x = nameLength + surnameLength;
        System.out.println(1 + " * " + x + " = " + x);
        System.out.println(2 + " * " + x + " = " + x * 2);
        System.out.println(3 + " * " + x + " = " + x * 3);
        System.out.println(4 + " * " + x + " = " + x * 4);
        System.out.println(5 + " * " + x + " = " + x * 5);
        System.out.println(6 + " * " + x + " = " + x * 6);
        System.out.println(7 + " * " + x + " = " + x * 7);
        System.out.println(8 + " * " + x + " = " + x * 8);
        System.out.println(9 + " * " + x + " = " + x * 9);
        System.out.println(10 + " * " + x + " = " + x * 10);
    }
    private static void calculator(){
        System.out.println("task: 4");
        char operator;
        double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        if(operator == '+'){
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
        } else if (operator == '-') {
            result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
        } else if (operator == '*') {
            result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
        } else if (operator == '/') {
            result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        } else {
            System.out.println("Invalid operator!");
        }
    }
}