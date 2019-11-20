package MyProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SearchToFile{
    private static boolean o = true;
    private static Scanner scanCountry;

    static void searchCount(String countryEnt) {
        File listCountry = new File("/home/max/IdeaProjects/project_country/src/ListOfCountry");
        try {
            scanCountry = new Scanner(listCountry);
        } catch (FileNotFoundException e) {
            System.out.println("Такого пути к файлу не существует");
            e.printStackTrace();
        }
        while (o) {
            o = scanCountry.hasNextLine();
            if (!o){
                System.out.println("Такого города нет");
            } else {
                String name = scanCountry.nextLine();

                String pattern = String.format("^С.*%s.*", countryEnt + "?+");
                Pattern r = Pattern.compile(pattern.toLowerCase());
                Matcher m = r.matcher(name.toLowerCase());

                if (m.find()) {
                    String s = m.group().substring(0, 1).toUpperCase() + m.group().substring(1);
                    System.out.println(s);
                    break;
                }
            }
        }
    }
}
class InputCheck {
    void inputLine(Scanner line) {
        if (!line.hasNextInt()){
            String countryEntry = line.nextLine();
            SearchToFile.searchCount(countryEntry);
        } else {
            System.out.println("Вы ввели цифры");
        }
    }
}