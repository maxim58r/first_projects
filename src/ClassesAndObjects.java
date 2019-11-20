public class ClassesAndObjects {
    public static void main(String[] args) {
        Persona person1 = new Persona();
        person1.name = "Дмитрий";
        person1.age = 30;
        System.out.println("Меня зовут "+ person1.name + "," + " мой возраст " + person1.age + " лет");

        Persona person2 = new Persona();
        person2.name = "Арсений";
        person2.age = 7;
        System.out.println("Меня зовут "+ person2.name + "," + " мой возраст " + person2.age + " лет");
    }
}

class Persona{
    String name;
    int age;
}