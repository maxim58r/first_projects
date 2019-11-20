public class Construction {
    public static void main(String[] args) {
        Man man1 = new Man();

    }
}

class Man {
    private String name;
    private int age;

    public Man(){
        System.out.println("Первый конструктор");
        this.name = "Имя по умолчагию";
        this.age = 0;
    }
    public Man(String name){
        System.out.println("Второй конструктор");
        this.name =name;
    }
    public Man(String name, int age){
        System.out.println("Третий конструктор");
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}