public class Main{
    public static void main(String [] args){
        // System.out.println("Hello...");
        // Create Human objects/instances
        Human nimal = new Human("Nimal");
        Human kamal = new Human("Kamal");
        // System.out.println(nimal);
        // System.out.println(kamal);
        // nimal.eat();
        System.out.println(nimal.name);
        System.out.println(kamal.name);
        nimal.eat();
        kamal.eat();
    }
}