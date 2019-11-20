package Lesson_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) {

        /*        String separator = File.separator;
        String text = separator + "home" + separator + "max" + separator + "Рабочий стол" + separator + "Java" + separator +"text.txt";
        File file = new File(text);  Вариант_1 */

        File file = new File("text_2");

        Scanner scanner = null;
        try {// Обработка исключения если файл "text_2" не найден
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Такого пути к файлу не существует!");
        }

        String line = scanner.nextLine();
        String[] numberString = line.split(" ");
//
        int[] numbers = new int[5];
        int counter = 0; // указывает на текущий индекс
        for (String number : numberString){
            numbers[counter++] = Integer.parseInt(number); // преобразование строки в число
        }

        System.out.println(Arrays.toString(numbers));

        /*while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }  Вариант_1 */
        scanner.close();
    }
}
