// package Lecture_2.source;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class RGB {
    public static void main(String[] args) {
        String imagePath = args[0];
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            int width = image.getWidth();
            int height = image.getHeight();

            // Iterate over each pixel of the image
            System.out.println("[");
            for (int y = 0; y < 10; y++) {
                System.out.print("[");
                for (int x = 0; x < 10; x++) {`
                    // Get the RGB values of the pixel
                    int rgb = image.getRGB(x, y);
                    Color color = new Color(rgb);

                    // Extract the individual RGB components
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();

                    // Print or process the RGB values
                    System.out.print(red + ", ");
                }
                System.out.println("]");
            }
            System.out.println("]");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}