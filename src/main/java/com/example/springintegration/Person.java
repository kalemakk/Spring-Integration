package com.example.springintegration;

public class Person {
    String firstName;
    String lastName;
    String phoneNumber;

    public Person(String firstName, String lastName){
        super();
        this.firstName = firstName;
        this.lastName =lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    @Override
//    public String toString() {
//        return "Person[" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ']';
//    }
}
