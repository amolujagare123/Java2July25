package Inheritance.superDemo;

public class Employee {

    int salary = 45000;

    void empWork()
    {
        System.out.println("empWork");
    }

    void salary()
    {
        System.out.println("Employee Salary");
    }

   Employee()
    {
        System.out.println("Employee constructor");
    }

    Employee(int id)
    {
        System.out.println("Employee constructor id="+id);

    }
}

class Programmer extends Employee
{
    int bonus = 20000;
    int salary = 60000;


    Programmer()
    {
        super(10);
        System.out.println("Programmer constructor");
    }


    void salary()
    {
        System.out.println("Programmer Salary");
    }

    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    void display()
    {
        System.out.println("bonus="+bonus);

        System.out.println("salary="+super.salary);
        super.salary();

        programmerWork();
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();

   //     p.display();

    }//
}
