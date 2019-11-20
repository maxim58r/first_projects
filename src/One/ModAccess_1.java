package One;

class ModAccess_1 {
    void fly(String k) {
        ModAccess modAccess = new ModAccess();

       // System.out.println(modAccess.f); // private int f = 4;
        System.out.print(modAccess.g + k + "ModAccess_1;"); // protected int g = 5;
        System.out.print(modAccess.h + k + "ModAccess_1;"); // public int h = 6;
        System.out.println(modAccess.j + k + "ModAccess_1;"); // int j = 7;
    }
}
class TestMod_2 {
    void swim(String l) {
        ModAccess modAccess = new ModAccess();

       // System.out.println(modAccess.f); // private int f = 4;
        System.out.print(modAccess.g + l + "TestMod_1;"); // protected int g = 5;
        System.out.print(modAccess.h + l + "TestMod_1;"); // public int h = 6;
        System.out.println(modAccess.j + l + "TestMod_1;"); // int j = 7;
    }
}
class TestMod_1 {
    void go(String x) {
        ModAccess modAccess = new ModAccess();

//        System.out.print(modAccess.f + x); // private int f = 4;
        System.out.print(modAccess.g+ x); // protected int g = 5;
        System.out.print(modAccess.h+ x); // public int h = 6;
        System.out.println(modAccess.j+ x); // int j = 7;
    }
}


class TestMod {
    void run(String c) {
        ModAccess modAccess = new ModAccess();

        // System.out.println(modAccess.f); // private int f = 4;
        System.out.print(modAccess.g); // protected int g = 5;
        System.out.print(modAccess.h); // public int h = 6;
        System.out.println(modAccess.j); // int j = 7;
    }
}