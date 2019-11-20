import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindCountry{
    private static String name;
    private static Matcher m;
    private static boolean o = true;
    private static Scanner scanCountry;


    public static void main(String[] args) throws FileNotFoundException {

        File listCountry = new File("/home/max/IdeaProjects/project_country/src/ListOfCountry");

        scanCountry = new Scanner(listCountry);
        System.out.print("Введите название страны или столицы или несколько первых букв: ");
        Scanner a  = new Scanner(System.in);
        String countryEnt = a.nextLine();

        while (o){
        o = scanCountry.hasNextLine();
        name = scanCountry.nextLine();

       String pattern = String.format("^С.*%s.*", countryEnt+"?+");
        Pattern r = Pattern.compile(pattern.toLowerCase());
        m = r.matcher(name.toLowerCase());

        if (m.find()) {
            System.out.println(m.group().substring(0, 1).toUpperCase()+m.group().substring(1));
            break;
        }
    }
}
}

