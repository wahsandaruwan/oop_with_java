public class Human{
    String name;

    // Constructor
    // Special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
    Human(String name){
        this.name = name;
    }

    void eat(){
        System.out.println(name+" is eating.");
    }
}