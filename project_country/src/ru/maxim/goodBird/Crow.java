package ru.maxim.goodBird;

public class Crow extends Bird {
    public Crow (String name) {
        super(name);
    }

    @Override
    public void feed() {
        setFlying(true);
    }
}
