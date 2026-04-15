package com.pluralsight;

import  java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static void main() {


        // Get user input
        CellPhoneApplication theCellPhoneApplication = getCellPhoneApplicationDetails();

        // Display user output
        displayCellPhoneApplicationConfirmation(theCellPhoneApplication);
    }

        // All user input for Cell Phone info
    static CellPhoneApplication getCellPhoneApplicationDetails() {

        CellPhoneApplication theCellPhoneApplication = new CellPhoneApplication();

        System.out.println("Cell Phone Application");
        System.out.println();

        // Ask for user's name
        System.out.print("Who is the owner of the phone?: ");
        String name = input.nextLine();
        theCellPhoneApplication.setName(name);


        //Ask for user's phone information
        System.out.print("What is the make/model of the phone?: ");
        String model = input.nextLine();
        theCellPhoneApplication.setModel(model);

        System.out.print("Who is the phone carrier: ");
        String carrier = input.nextLine();
        theCellPhoneApplication.setCarrier(carrier);

        System.out.print("What is the phone number?: ");
        String number = input.nextLine();
        theCellPhoneApplication.setPhoneNumber(number);

        System.out.print("What is the serial number?: ");
        int serialNumber = input.nextInt();
        theCellPhoneApplication.setSerialNumber(serialNumber);

        return theCellPhoneApplication;
    }

    static void displayCellPhoneApplicationConfirmation(CellPhoneApplication theCellPhoneApplication)
    {
        System.out.println();
        System.out.println("Cell Phone Application Details");
        System.out.println("=======================================");
        System.out.println("Name: " + theCellPhoneApplication.getName());
        System.out.println("Model: " + theCellPhoneApplication.getModel());
        System.out.println("Carrier: " + theCellPhoneApplication.getCarrier());
        System.out.println("Phone Number: " + theCellPhoneApplication.getPhoneNumber());
        System.out.println("Serial Number: " + theCellPhoneApplication.getSerialNumber());

    }

}
