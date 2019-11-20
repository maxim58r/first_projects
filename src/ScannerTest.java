import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        String name;
        String a = "Азербайджана";
        boolean b = false;

        //a.toLowerCase();
        //String nameCountry = "\w+\s{}\s-\s\w+";

    Scanner scanCountry = new Scanner("Столица Австралии — Канберра\n" +
            "Столица Австрии — Вена\n" +
            "Столица Азербайджана — Баку\n" +
            "Столица Албании - Тирана\n " +
            "Азербайджана");


    while (!b){
        name = scanCountry.nextLine();
        b = name.matches(a);
        
    } System.out.println("Word found!");

}
}
