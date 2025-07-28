package Inheritance;

class Animal2 {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Mamal extends Animal2 {
    void walk() {
        System.out.println("Mamal walks.");
    }
}

class Tiger extends Mamal {
    void roar() {
        System.out.println("Tiger roars.");
    }
}

class Reptile extends Animal2 {
    void crowl() {
        System.out.println("Reptile crawls.");
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Mamal m = new Mamal();
        m.walk();
        m.eat();

        Tiger t = new Tiger();
        t.roar();
        t.walk();
        t.eat();

        Reptile r = new Reptile();
        r.crowl();
        r.eat();
    }
}
