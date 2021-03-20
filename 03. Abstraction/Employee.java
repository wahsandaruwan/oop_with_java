public class Employee extends Human{
    int salary = 25000;

    void work(){
        System.out.println("He is working.");
    }

    // This will override Human.eat();
    void run(){
        System.out.println("He is running.");
    }
}