package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Chinadigitalwatch china = new Chinadigitalwatch(); // Bad and cheap china watches without parameters
//        china.name = "Shrolex";
//        china.color = "";
//        china.weigth = -123;
//        System.out.println("Watch name: "+china.name);
//        System.out.println("Watch color: "+china.color);
//        System.out.println("Watch weight: "+china.weigth);
//        china.ring();


//        Digitalwatch digw = new Digitalwatch("", "Black", 98889); // Good watches with parameters
//        System.out.println("Watch brand: "+digw.getName());
//        System.out.println("Watch color: "+digw.getColor());
//        System.out.println("Watch price: "+digw.getPrice()+"$");
//        digw.setPrice(1322);
//        System.out.println("Watch price: "+digw.getPrice()+"$");

        Smartwatch smartXiaomi = new Smartwatch();
        smartXiaomi.setName("Xiaomi");
        smartXiaomi.setPrice(70);
        System.out.println("Smart watch name: "+smartXiaomi.getName() + " and price: " +smartXiaomi.getPrice()+ "$");

        Smartwatch smartApple = new Smartwatch("Apple", 600);
        smartApple.setMemory(2);
        System.out.println("Smart watch name: "+smartApple.getName() + ", memory: " + smartApple.getMemory() + "Gb"+ " and price: " +smartApple.getPrice()+ "$");
        System.out.println("Check out ringtone on my Iphone: ");
        smartApple.ring();

        Smartwatch smartSamsung = new Smartwatch("Samsung", "Metal", 4, 400);
        System.out.println("Smart watch name: "+smartSamsung.getName() + ", memory: " + smartSamsung.getMemory() + "Gb"+ " and price: " +smartSamsung.getPrice()+ "$");
        if (smartSamsung.getMemory()> smartApple.getMemory()) {System.out.println("Ha-ha, my memory is bigger than yours, Apple!");}
        System.out.println("Oh, my new sms: ");
        smartSamsung.message();

        if (smartSamsung.getName()=="Samsung") {
            System.out.println("If you have Samsung watches, check out our calculator:");
            Calculator calc = new Calculator();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number:");

            if (sc.hasNextInt()) {
                int number1 = sc.nextInt(); //Scanning first number

                System.out.println("Enter + if you want to ADD;");
                System.out.println("Enter - if you want to SUBSTRACT;");
                System.out.println("Enter * if you want to MULTIPLY;");
                System.out.println("Enter / if you want to DIVIDE.");

                String action = sc.next(); //Scanning action

                System.out.println("Enter second number:");
                int number2 = sc.nextInt(); //Scanning second number


                switch (action) {
                    case "+":
                        System.out.println(calc.mathSum(number1, number2));
                        break;
                    case "-":
                        System.out.println(calc.mathMin(number1, number2));
                        break;
                    case "*":
                        System.out.println(calc.mathMult(number1, number2));
                        break;
                    case "/":
                        System.out.println(calc.mathDiv(number1, number2));
                        break;
                    default:
                        System.out.println("You have entered " + action + " Wrong action! Run program again and enter correct action: +,-,*,/.");
                }
            } else {
                System.out.println("Error: This is calculator. Next time please enter any number.");
            }
            sc.close();
        }
    }
}
