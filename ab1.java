import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

abstract class User {
    public void show(){
        System.out.println("嘻嘻");
    }
}

interface Stu {
    void shout();
    String name = "123";
}

public class ab1{
    public static void main(String[] args){
        HashMap hashMap = new HashMap();
        hashMap.put("jlg", "jlg");
        hashMap.put("hefan", "hefan");
        hashMap.put("hefan", "yangjin");
        Set keys = hashMap.keySet();
        for(Object key: keys){
            System.out.println(key);
        }


    }

}
class Users extends User implements Stu{
    @Override
    public void show() {
        super.show();
        System.out.println(name);
    }
    @Override
    public void shout() {

    }
}