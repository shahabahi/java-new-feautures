package com.api.iostream;


import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream inStream = null;
        FileOutputStream outStream = null;
        try {
            inStream = new FileInputStream("/home/arousha/source.txt");
            outStream = new FileOutputStream("/home/arousha/destination.txt");
            int content;
            while ((content = inStream.read()) != -1) {
                outStream.write((byte) content);
            }
        } finally {
            if (inStream != null) {
                inStream.close();
            }
            if (outStream != null) {
                outStream.close();
            }
        }
    }
}
