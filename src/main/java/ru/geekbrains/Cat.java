package ru.geekbrains;

public class Cat extends Animal{
    private static int n;

    public Cat (String name) {
        super(name);
        n++;
    }

    public static int getCatCount () {
        return n;
    }

    @Override
    public void run(int a) {
        if (a<=200) {
            super.run(a);
        }
        else {
            System.out.println("Кот не может пробежать больше 200 м.");
        }
    }

    @Override
    public void swim(int a) {
            System.out.println("Кот не может плавать.");
    }
}
