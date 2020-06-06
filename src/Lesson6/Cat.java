package Lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super("Кот", name, 200, 2, 0);
    }

    @Override
    public void swim(double dist) {
        System.out.println(type + " " + name + " не умеет плавать");
    }
}
