package ru.maxim.goodBird;

public class Blackbird extends Bird {
    public Blackbird (String name) {
        super(name);
    }

    @Override
    public void feed() {
        setFlying(false);
    }
}
