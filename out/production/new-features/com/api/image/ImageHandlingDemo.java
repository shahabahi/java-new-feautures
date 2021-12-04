package com.api.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageHandlingDemo {
    public static void main(String[] args) {
        int width = 963;
        int height = 640;
        BufferedImage image = null;
        image = readFromFile(width, height);
        writeToFile(image);
    }

    private static BufferedImage readFromFile(int width, int height) {
        BufferedImage image=null;
        try {
            File sampleImage = new File("/home/arousha/sample.jpg");
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(sampleImage);
            System.out.println("Reading Complete." + image);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return image;
    }

    private static void writeToFile(BufferedImage bufferedImage) {
        try {
            File output = new File("/home/arousha/out.jpg");
            ImageIO.write(bufferedImage, "jpg", output);
            System.out.println("Writing Complete.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
