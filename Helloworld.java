import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {
        Person p1 = new Person(123);
        p1.printAge();
        p1.schoolName = "新关村美新小学";
        Person.show();
    }
}

class  Person{
    int age;
    static String schoolName;
    public Person(){
        System.out.println("我是午餐的构造方法");
    }
    public Person(int Age){
//        this();
        this.age = Age;
    }
    void printAge(){
        System.out.println("你好" + this.age);
    }
    static void  show(){
        System.out.println(schoolName);
    }

}