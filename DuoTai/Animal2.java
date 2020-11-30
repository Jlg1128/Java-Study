package DuoTai;

interface Animal {
    void shout();
}

public class Animal2 {
    public static void main(String[] args){
        Cat cat = new Cat("maowang");
        System.out.println(cat instanceof Animal);
    }
   static void show(){
        System.out.println("show this");
    }
}

class Cat implements Animal {
    private String catName;
    public Cat(String catName){
        this.catName = catName;
    }
    @Override
    public void shout() {
        System.out.println("xix");
    }
}

