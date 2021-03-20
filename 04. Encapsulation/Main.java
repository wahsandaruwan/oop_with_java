public class Main{
    public static void main(String [] args){
        Human human = new Human("Kasun", 30);
        System.out.println(human.getName());
        System.out.println(human.getAge());
        // human.name = "Chamara";
        human.setName("Chamara");
        human.setAge(40);
        System.out.println(human.getName());
        System.out.println(human.getAge());
    }
}