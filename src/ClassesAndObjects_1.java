public class ClassesAndObjects_1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("paka");
        person1.setAge(35);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        person1.speak();
    }
}

class Person{
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()){
            System.out.println("Ты не ввел имени");
            System.out.println("Попробуй еще раз");
        } else {
        name = userName;
        }
    }
    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge<=0){
            System.out.println("Вы ввели отрицательный возраст");
        }else {
        age = userAge;
        }
    }
    public int getAge() {
        return age;
    }

    int retirement() {
        int years = 65 - age;
        return years;
    }

    void speak(){
        if (retirement()<=0){
            System.out.println();
            System.out.println(name + " Вы уже дожны быть на пенсии, так как вам " + age + " лет!");
        }else {
            System.out.println();
            System.out.println("Меня зовут " + name + "," + " мой возраст " + age + " лет, мне до пенсии " + retirement() + " лет.");
        }
    }

}