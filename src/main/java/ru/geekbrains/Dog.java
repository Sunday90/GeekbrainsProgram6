package ru.geekbrains;

public class Dog extends Animal{
    private static int n;

    public Dog (String name) {
        super(name);
        n++;
    }

    public static int getDogCount () {
        return n;
    }

    @Override
    public void run(int a) {
        if (a<=500) {
            super.run(a);
        }
        else {
            System.out.println("Собака не может пробежать больше 500 м.");
        }
    }

    @Override
    public void swim(int a) {
        if (a<=20) {
            super.swim(a);
        }
        else {
            System.out.println("Собака не может проплыть больше 20 м.");
        }
    }
}
