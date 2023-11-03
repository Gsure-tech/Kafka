package com.gsuretech.kafka;

import java.util.Scanner;

public class TryingScanner{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your firstname");
        String fName = sc.nextLine();
        System.out.println("Enter your lastname");
        String lName = sc.nextLine();

        System.out.println("Your Name is " + fName + " " + lName);
    }
}
