package Inheritance;

class Animal {

    int a = 10;
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    int a = 20;
    void bark() {
        System.out.println("The dog barks.");
    }
}

class BabyDog extends Dog
{
    int a =30;
    void weep() {
        System.out.println("The baby dog weeps.");
    }

    void display()
    {
        System.out.println("a="+super.a); // 30
        Animal ob = new Animal();

    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
        d.eat();

        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();


        bd.display();
    }
}
