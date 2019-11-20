package One;


public class ModAccess {
    public static void main(String[] args) {
        ModAccess_1 digit = new ModAccess_1();
        digit.fly("_void fly_");

        ModAccess digit4 = new ModAccess();
        digit4.method("_void method_");

        TestMod_1 digit5 = new TestMod_1();
        digit5.go("_private static class_");

        TestMod digit6 = new TestMod();
        digit6.run("_static class_");

        One.TestMod_2 digit_7 = new TestMod_2();
        digit_7.swim("_swim_");

    }

    private String f = " private ";
    protected String g = " protected ";
    public String h = " public ";
    String j = " default ";


    void method(String z) {
        ModAccess modAccess = new ModAccess();

        System.out.print(modAccess.f); // private int f = 4;
        System.out.print(modAccess.g); // protected int g = 5;
        System.out.print(modAccess.h); // public int h = 6;
        System.out.println(modAccess.j); // int j = 7;
    }


}


