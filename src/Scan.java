import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanCountry = new Scanner("Столица Австралии — Канберра\n" +
                "Столица Австрии — Вена\n" +
                "Столица Азербайджана — Баку\n" +
                "Столица Албании - Тирана\n" +
                "Столица Алжира — Алжир\n" +
                "Столица Анголы — Луанда\n" +
                "Столица Андорры — Андорра-ла-Велья\n" +
                "Столица Аргентины — Буэнос-Айрес\n" +
                "Столица Армении — Ереван\n" +
                "Столица Афганистана — Кабул\n" +
                "Столица Багам — Нассау\n");

        String name = scanCountry.nextLine();
        while () {

            System.out.println(name);
        }

    }
}
