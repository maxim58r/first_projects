package Lesson_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exciption_1 {
    public static void main(String[] args) {
        File file = new File("HW");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("You enter wrong path !");
        }
        while (scanner.hasNextLine()){

        String line = scanner.nextLine();
        System.out.println(line);
        }
        scanner.close();


    }
}
