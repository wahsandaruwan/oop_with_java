public class Human{
    // Attributes will be private and can access them using getters & setters
    // You should make attributes private if you don't have special reason to make them public/protected
    private String name;
    private int age;

    // Constructor
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}