public class EnumExemple {
    enum Coffe { SMALL("a",100,"Strong"),
        MEDIUM("b",200,"Medium"),
        BIG("c", 300, "Light") ;

    String coffeClass;
    int mililitres;
    String strenght;


    Coffe(String coffeClass, int mililitres, String strenght){
        this.coffeClass = coffeClass;
        this.mililitres = mililitres;
        this.strenght = strenght;
    }
        String getCoffeClass() {
            return coffeClass;
        }
        int getMililitres(){
        return mililitres;
        }
        String getStrenght() {
        return strenght;
        }
    }

    public static void main(String[] args) {
        Coffe coffeSmall = Coffe.SMALL;
        Coffe coffeBig = Coffe.BIG;
        Coffe coffeMedium = Coffe.MEDIUM;

        System.out.println(coffeSmall.getCoffeClass());
        System.out.println(coffeBig.getCoffeClass());
        System.out.println(coffeMedium.getStrenght());
        System.out.println(coffeBig.getMililitres());
    }
}
