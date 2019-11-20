package Test;

import java.util.Scanner;

public class ArrayL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you Age: ");
        int a = scanner.nextInt();

        System.out.print("Enter you Name: ");
        Scanner name = new Scanner(System.in);
        String b = name.nextLine();

        System.out.print("Enter you Height: ");
        int c = scanner.nextInt();

        System.out.print("Enter you Weight: ");
        int d = scanner.nextInt();

        Person human = new Person(b, a, c, d);
        human.wideHuman();
    }
}

class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String acess;

    Person(String name, int age, int height, int weight) {
        this.name = name.toUpperCase();
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    void wideHuman() {
        if (age < 18) {
            acess = "young";
        } else if (age >= 18 && age < 60) {
            acess = "norm";
        } else if (age >= 60) {
            acess = "old";
        }
        System.out.printf("You age: %d and level %s\nYou name: %s\n" +
                        "You height: %d and you weight %d",
                age, acess, name, height, weight);
    }
}


