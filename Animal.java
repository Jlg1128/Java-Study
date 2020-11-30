interface AnimalType {
    static String ANIMAL_NAME = "Dog";
    public void shout();
}
class Dog implements AnimalType {
    public void shout() {
       System.out.println("shoutttt");
    }
}
public class Animal {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.shout();
    }
}

