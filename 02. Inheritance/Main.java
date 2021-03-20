public class Main{
    public static void main(String [] args){
        // Create a Student object
        Student std = new Student(25,80);
        std.eat();
        System.out.println(std.age);

        std.learn();
        System.out.println(std.marks);
    }
}