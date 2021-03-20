public abstract class Human{
    // Abstract classes can't be instantiated, but they can have a subclass
    boolean isMarried = true;

    // Normal method
    void drink(){
        System.out.println("He is drinking.");
    }

    // Abstract method
    // Abstract methods are declared without an implementation
    abstract void run();
}