package DSA_Java.random;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        System.out.print("Enter Roll & Dept: ");
        Scanner input = new Scanner(System.in);
        int roll = input.nextInt();
        String dept = input.next();

        switch (roll){
            case 1:
                System.out.println("DONY");
                break;
            case 2:
                System.out.println("Rony");
                break;
            case 3:
                System.out.println("Riz");
                switch (dept){
                    case "IT":
                        System.out.println("From IT");
                        break;
                    case "EEE":
                        System.out.println("From EEE");
                        break;
                    default:
                        System.out.println("No info");
                }
                break;
            default:
                System.out.println("Not valid");

        }
    }
}
