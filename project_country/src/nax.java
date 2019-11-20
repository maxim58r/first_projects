import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class nax {

    public static void main( String args[] ) {
        // Строка для сканирования, чтобы найти шаблон
        String str = "Крещение Руси произошло в 978 году! Не так ли?";
        System.out.println("Введите искомую фразу");
        Scanner i = new Scanner(System.in);
        String name = i.nextLine();
        String pattern = String.format("^.*%s.*[0-9]+", name);

        // Создание Pattern объекта
        Pattern r = Pattern.compile(pattern);

        // Создание matcher объекта
        Matcher m = r.matcher(str);
        if (m.find( )) {
            System.out.println("Найдено значение: " + m.group());
        }else {
            System.out.println("НЕ СОВПАДАЕТ");
        }
    }
}