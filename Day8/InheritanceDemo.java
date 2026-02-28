package Day8;

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Animal a = new Dog();
        a.sound();
    }
}

/*
has - a - example
class Engine {

    void start() {
        System.out.println("Engine started");
    }
}

class Car {

    Engine engine = new Engine();

    void startCar() {
        engine.start();
    }
}
 */