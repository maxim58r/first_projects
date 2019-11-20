public class Static {
    public static void main(String[] args) {
        Men m1 = new Men("Nikolai", 57);
        m1.printNumberOfPeople();
        Men m2 = new Men("Mikola", 21);
        m2.printNumberOfPeople();
        Men m3 = new Men("Akolai", 5);
        m3.printNumberOfPeople();
        Men m4 = new Men("Dmitriy", 73);
        m4.printNumberOfPeople();
        Men m5 = new Men("Alekseiy", 12);
        m5.printNumberOfPeople();



    }
}

class Men {
    private String name;
    private int age;

    private static int countPeople;

    public Men(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printNumberOfPeople(){
        System.out.println(name+" Number Of People "+countPeople);
    }
}