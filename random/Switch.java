package DSA_Java.random;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.print("Enter a food name: ");
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        String meat = input.next();
        int day = input.nextInt();
        //normal switch method
        switch (fruit) {
            case "Ma":
                System.out.println("Good food");
                break;
            case "Apple":
                System.out.println("Eat every day");
                break;
            case "Orange":
                System.out.println("Good Vit-c");
                break;
            default:
                System.out.println("Enter valid fruit");
        }
        // Enhanced switch method
        switch (meat) {
            case "Chicken" -> System.out.println("Fry");
            case "Goat" -> System.out.println("Good");
            case "Lamb" -> System.out.println("Tasty");
            default -> System.out.println("Enter valid fruit");
        }
        //for no inner break statements.
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");

        }
    }
}
