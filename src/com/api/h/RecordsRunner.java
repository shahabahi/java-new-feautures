package com.api.h;

public class RecordsRunner {
    record Person(String name, String email, String phonNumber) {
        //        Person(String name, String email, String phonNumber) {
//            if (name == null) {
//                throw new IllegalArgumentException("name is null");
//            }
//            this.name = name;
//            this.email = email;
//            this.phonNumber = phonNumber;
//        }
        Person {
            if (name == null) {
                throw new IllegalArgumentException("name is null");
            }

        }
    }

    public static void main(String[] args) {
        Person person = new Person("Shahab", "Shahab@gmail.com", "123-456-7890");
        Person person1 = new Person("Shahab", "Shahab@gmail.com", "123-456-7890");
        System.out.println(person);
        System.out.println(person.equals(person1));
        System.out.println(person.name());

    }
}
