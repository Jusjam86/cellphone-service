package com.pluralsight;

import  java.util.Scanner;

public class CellPhoneApplication {

    static Scanner input = new Scanner(System.in);

    static void main() {


        // CellPhone class called, 2 instances
        CellPhone theCellPhone = getCellPhoneApplicationDetails();

        CellPhone theCellPhone2 = getCellPhoneApplicationDetails();

        // Display user output
        displayCellPhoneApplicationConfirmation(theCellPhone);

        // CellPhones calling each-other, using methods form the CellPhone class
        theCellPhone.dialNumber(theCellPhone2.getPhoneNumber());
        theCellPhone2.dialNumber(theCellPhone.getPhoneNumber());
    }

        // All user input for Cell Phone info
    static CellPhone getCellPhoneApplicationDetails() {

        CellPhone theCellPhone = new CellPhone();

        // Start of application
        System.out.println();
        System.out.println("Cell Phone Application");
        System.out.println("--------------------------------");

        // Ask for user's name
        System.out.print("Who is the owner of the phone?: ");
        String name = input.nextLine().trim();
        theCellPhone.setName(name);


        //Ask for user's phone information
        System.out.print("What is the make/model of the phone?: ");
        String model = input.nextLine().trim();
        theCellPhone.setModel(model);

        System.out.print("Who is the phone carrier: ");
        String carrier = input.nextLine().trim();
        theCellPhone.setCarrier(carrier);

        System.out.print("What is the phone number?: ");
        String number = input.nextLine().trim();
        theCellPhone.setPhoneNumber(number);

        System.out.print("What is the serial number?: ");
        int serialNumber = input.nextInt();
        // clears user input
        input.nextLine();
        theCellPhone.setSerialNumber(serialNumber);

        // line is here so it doesn't break
        return theCellPhone;
    }

    static void displayCellPhoneApplicationConfirmation(CellPhone theCellPhone)
    {
        System.out.println();
        System.out.println("Cell Phone Application Details");
        System.out.println("=======================================");
        System.out.println("Name: " + theCellPhone.getName());
        System.out.println("Model: " + theCellPhone.getModel());
        System.out.println("Carrier: " + theCellPhone.getCarrier());
        System.out.println("Phone Number: " + theCellPhone.getPhoneNumber());
        System.out.println("Serial Number: " + theCellPhone.getSerialNumber());
        System.out.println("=======================================");
        System.out.println();
    }

}
