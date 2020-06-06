package Lesson6;

public class Animal {
    String type;
    String name;

    double maxRunDistance;
    double maxJumpHeight;
    double maxSwimDistance;

    public Animal(String type, String name, double _maxRunDistance, double _maxJumpHeight, double _maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = _maxRunDistance;
        this.maxJumpHeight = _maxJumpHeight;
        this.maxSwimDistance = _maxSwimDistance;
    }

    public void run(double dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " пробежал дистанцию");
        } else {
            System.out.println(type + " " + name + " не справился с бегом");
        }
    }

    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " удачно перепрыгнул препятствие");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть");
        }
    }

    public void swim(double dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " отлично проплыл");
        } else {
            System.out.println(type + " " + name + " не смог проплыть");
        }
    }
}
