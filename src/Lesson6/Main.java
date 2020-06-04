package Lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Murzik");
        Dog dog1 = new  Dog("Sharik");
        Dog dog2 = new  Dog("Tuzik");

        cat1.jump(5);
        cat2.jump(1);
        cat1.run(30);
        cat1.run(300);
        cat1.swim(2);
        dog1.jump(1);
        dog2.jump(0.1);
        dog1.run(400);
        dog1.run(700);
    }
}
