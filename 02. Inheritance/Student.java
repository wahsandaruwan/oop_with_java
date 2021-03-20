public class Student extends Human{
    int marks;

    // Constructor
    Student(int age, int marks){
        super(age);
        this.marks = marks;
    }

    void learn(){
        System.out.println("He is learning.");
    }

    // This will override Human.eat();
    void eat(){
        System.out.println("Student is eating.");
    }
}