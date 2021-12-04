package com.api.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDeserDemo {
    public static void main(String[] args) {
        Student student = new Student("Shahab", 45, "26 Shiraz");
        String fileName = "/home/arousha/test.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;
        //Serialization
        try {
            fileOut = new FileOutputStream(fileName);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);
            objOut.close();
            fileOut.close();
            System.out.println("Object has been serialized: \n" + student);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //Deserialization
        FileInputStream fileIn=null;
        ObjectInputStream objIn=null;
        try {
            fileIn = new FileInputStream(fileName);
            objIn = new ObjectInputStream(fileIn);
            Student student1=(Student) objIn.readObject();
            System.out.println("Object has been deserialized: \n" + student1);
            objIn.close();
            fileIn.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
