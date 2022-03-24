package com.bl.addressbook;

import java.util.Scanner;
import java.util.objects;
import java.util.ArrayList;

public class AddressBook {
    int index = 0;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contact> entry = new ArrayList<>();

    void setContact(){
        Contact person = new Contact(index);
        System.out.println("Enter First Name: ");
        person.setFirstName(sc.nextLine());
        System.out.println("Enter Last Name: ");
        person.setLastName(sc.nextLine());
        System.out.println("Enter Address: ");
        person.setAddress(sc.nextLine());
        System.out.println("Enter City: ");
        person.setCity(sc.nextLine());
        System.out.println("Enter State: ");
        person.setState(sc.nextLine());
        System.out.println("Enter Zip Code: ");
        person.setZip(sc.nextLine());
        System.out.println("Enter Phone Number: ");
        person.setPhoneNumber(sc.nextLine());
        System.out.println("Enter E-Mail: ");
        person.seteMail(sc.nextLine());
        System.out.println("\n");
        entry.add(person);
        index ++;
    }

    void editContact(){
        System.out.println("Enter the contact's First Name to be edited: ");
        String firstName = sc.nextLine();
        for (Contact person : entry){
            if(Objects.equals(person.getFirstName(), firstName)){
                System.out.println("Enter First Name: ");
                person.setFirstName(sc.nextLine());
                System.out.println("Enter Last Name: ");
                person.setLastName(sc.nextLine());
                System.out.println("Enter Address: ");
                person.setAddress(sc.nextLine());
                System.out.println("Enter City: ");
                person.setCity(sc.nextLine());
                System.out.println("Enter State: ");
                person.setState(sc.nextLine());
                System.out.println("Enter Zip Code: ");
                person.setZip(sc.nextLine());
                System.out.println("Enter Phone Number: ");
                person.setPhoneNumber(sc.nextLine());
                System.out.println("Enter E-Mail: ");
                person.seteMail(sc.nextLine());
                System.out.println("\n");
                entry.set(entry.indexOf(person), person);
            }
            else{
                System.out.println("The Contact doesn't Exist.");
            }
        }
    }

    void getContact(){
        for (Contact e: entry) {
            System.out.println("ID: " + e.id);
            System.out.println("First Name: " + e.firstName);
            System.out.println("Last Name: " + e.lastName);
            System.out.println("Address: " + e.address);
            System.out.println("City: " + e.city);
            System.out.println("State: " + e.state);
            System.out.println("Zip: " + e.zip);
            System.out.println("Phone Number: " + e.phoneNumber);
            System.out.println("E-Mail: " + e.eMail + "\n");
        }
    }
}
