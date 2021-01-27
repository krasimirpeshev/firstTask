package com.academy.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your pet name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your pet name is: " + name);
        System.out.println("Enter his age: ");

        int age = scanner.nextInt();
        System.out.println("His age is: " + age);
        System.out.println("Info that we already have about your pet: ");
        System.out. println("Your pet name is: " + name);
        System.out.println("Your pet age age is: " +age);
    }

}
