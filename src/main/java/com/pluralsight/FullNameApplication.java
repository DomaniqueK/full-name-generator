package com.pluralsight;


import java.util.Scanner;

public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name:");
        String lastName = scanner.nextLine();

        System.out.println("Please enter your middle name:");
        String middleName = scanner.nextLine();
        String name = firstName.trim();
        if (!middleName.isBlank());
        name = name + " " + middleName.trim();


        System.out.println("Please enter your suffix:");
        String suffix = scanner.nextLine();
        if (!suffix.isBlank())
            name = name + ", " + suffix.trim();


        name = name + " " + lastName.trim() + suffix;

        System.out.printf("Full Name: %s %s %s %s,", firstName, middleName, lastName, suffix);



    }
}
