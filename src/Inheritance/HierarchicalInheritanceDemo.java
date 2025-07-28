package Inheritance;

class Bird {
    void fly() {
        System.out.println("The bird can fly.");
    }
}

class Sparrow extends Bird {
    void sparrowColor() {
        System.out.println("Sparrow is brown.");
    }
}

class Crow extends Bird {
    void crowColor() {
        System.out.println("Crow is black.");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();

        Sparrow s = new Sparrow();
        s.sparrowColor();
        s.fly();

        Crow c = new Crow();
        c.crowColor();
        c.fly();
    }
}
