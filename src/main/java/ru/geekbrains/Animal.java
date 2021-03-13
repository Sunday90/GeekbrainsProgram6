package ru.geekbrains;

public abstract class Animal {
    private String name;
    static int n;

    Animal (String name) {
        this.name = name;
        n++;
    }
    public String getName () {
        return this.name;
    }

    public static int getAnimalCount() {
        return n;
    }

    private void setName (String name) {
        this.name = name;
    }

    public void run(int a) {
        System.out.printf("%s пробежал %d м.", getName(), a);
    }

    public void swim(int a) {
        System.out.printf("%s проплыл %d м.", getName(), a);
    }
}
