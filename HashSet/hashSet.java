package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class User {
    private String userName;
    private Number age;
    public User(String userName, Number age){
        this.userName = userName;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return userName.hashCode();
    }

    @Override
    public String toString() {
        return "woshi" + userName;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            System.out.println("obj相同");
            return true;
        }
        if(!(obj instanceof User)){
            return false;
        }
        User user2 = (User) obj;
        return user2.userName.equals(((User) obj).userName);
    }
}

public class hashSet {
    public static void main(String[] args){
        HashSet<User> set = new HashSet<User>();
        User user1 = new User("jlg", 20);
        User user2 = new User("hefan", 18);
        User user3 = new User("hefan", 18);
        System.out.println("nihao".hashCode());
        System.out.println("nihao".hashCode());
        set.add(user1);
        set.add(user2);
        set.add(user3);
        System.out.println(set);
        Iterator it = set.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj instanceof User);
        }
    }
}
