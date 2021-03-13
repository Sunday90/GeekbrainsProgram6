package ru.geekbrains;

public class Program {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Собака 1");
        Dog dog2 = new Dog("Собака 1");
        Dog dog3 = new Dog("Собака 1");
        Cat cat1 = new Cat("Кот 1");
        Cat cat2 = new Cat("Кот 2");


        cat1.swim(10);
        cat1.run(10);
        dog1.swim(30);
        dog1.run(10);

        System.out.println(Dog.getDogCount());
        System.out.println(Cat.getCatCount());
        System.out.println(Animal.getAnimalCount());
    }
}
