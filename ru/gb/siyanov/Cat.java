package ru.gb.siyanov;

public class Cat {
    public Cat(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    private String name;
    private int maxJump;
    private int maxRun;
    Cat cat = new Cat("Barsik",5,3);
    Cat cat1 = new Cat("Tiger",2,7);


}
