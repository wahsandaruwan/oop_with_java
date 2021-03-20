public class Main{
    public static void main(String [] args){
        // The ability of an object to identify as more than one type
        Student kasun = new Student();
        Employee saman = new Employee();
        Politician rohitha = new Politician();
        kasun.eat();
        // saman.eat();
        // rohitha.eat();
        
        // Child objects using Parent as Type/Reference
        Human dasun = new Student();
        dasun.eat();
        // Human sarath = new Employee();
        // sarath.eat();
        // Human kamal = new Politician();
        // kamal.eat();
    }
}