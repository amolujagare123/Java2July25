package AbstractionDemo;

public abstract class AbstractClassDemo {

    abstract void run();
    abstract void start();

     void display()
    {
        System.out.println("display");
    }
}

class  ChildAbstract extends AbstractClassDemo
{
    void run() {
        System.out.println("run");
    }

    void start() {
        System.out.println("start");
    }

    public static void main(String[] args) {

        AbstractClassDemo ob = new ChildAbstract();
        ob.display();
        ob.run();
        ob.start();
    }
}
