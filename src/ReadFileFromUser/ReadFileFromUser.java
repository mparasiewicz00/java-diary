package ReadFileFromUser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileFromUser {
    public static void main(String[] args) {
        boolean readed = false;

        while (!readed) {
            System.out.println("Enter filepath to read:");
            String path = getString();

            try {
                reader(path);
                readed = true;
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void reader(String path) throws FileNotFoundException {
        File f = new File(path);
        int numberOfSigns = 0;

        try (FileReader fileReader = new FileReader(f)) {
            int readedSign;

            while (( readedSign = fileReader.read()) != -1) {
                System.out.print((char) readedSign);
                numberOfSigns++;
            }

            System.out.println();
            System.out.println("Number of signs in file: " + numberOfSigns);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new FileNotFoundException();
        }
    }
    public static String getString () {
        return new Scanner(System.in).next();
    }
}
