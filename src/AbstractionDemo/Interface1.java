package AbstractionDemo;

import Inheritance.Polymorphism.Addition;

public interface Interface1 {
    void run();
    void start();
    void display();
}

interface Interface2 {

    void display();
}

class ChildInterface2 extends Addition implements Interface1,Interface2
{

    public void run() {
        System.out.println("run");
    }

    public void start() {
        System.out.println("start");
    }

    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {

        Interface1 ob1 = new ChildInterface2();
        ob1.display();

        Interface2 ob2 = new ChildInterface2();
        ob2.display();
    }
}
