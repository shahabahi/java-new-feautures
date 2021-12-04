package com.api.iostream;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamDemo {
    public static void main(String[] args) throws Exception {
        FileReader readeStream = null;
        FileWriter writerStream = null;
        try {
            readeStream = new FileReader("/home/arousha/source.txt");
            writerStream = new FileWriter("/home/arousha/destination.txt");
            int content;
            while ((content = readeStream.read()) != -1) {
                writerStream.append((char) content);
            }
        } finally {
            if (readeStream != null)
                readeStream.close();
            if (writerStream != null)
                writerStream.close();
        }
    }
}
