import java.io.IOException;
import java.util.*;

public class Process {
    public static void main(String[] args) throws IOException, InterruptedException {
        ArrayList li = new ArrayList();
        li.add("张三");
        li.add("李四");
        li.add("王五");
        li.add("肥六");
        Iterator myArr =  li.iterator();
        while (myArr.hasNext()){
            Object obj = myArr.next();
            if(obj == "张三"){
                li.remove(obj);
            }
            System.out.println("张三".equals(obj));
        }
    }
}
