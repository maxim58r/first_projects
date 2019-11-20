package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
       /* File mytest = new File("/home/max/IdeaProjects/project_country/src/HW");
        Scanner scanner = new Scanner(mytest);*/
        ArrayList <String> list = new ArrayList<>();

        while (list.size()<=5){
            System.out.print("Enter string: ");
            Scanner enterText = new Scanner(System.in);
            String text = enterText.next();
            list.add(text);
            int a = list.size();
            System.out.println(a);
            System.out.println(list);
        }
        System.out.println("Enter number operation: ");
        Scanner viewOperation = new Scanner(System.in);
        int operation = viewOperation.nextInt();

        switch (operation){
            case 1:{

            }break;

            case 2:{

            }break;

            case 3:{

            }break;

            case 4:{

            }break;

        }
        System.out.println("Enter number elements to array: ");
        Scanner view = new Scanner(System.in);
        int viewList = view.nextInt();
        System.out.printf("Total elements of arrays: %d\n" +
                "Your number to element of array: %d\n" +
                "And array itself: %s",list.size(), viewList, list.get(viewList-1));
    }
}