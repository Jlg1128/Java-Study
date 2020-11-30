package ClickSong;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ClickSongTest {
    public static void main(String[] args){
        ClickSongStore.storeName = "大富豪点歌系统";
        ClickSongStore clickSongSys =  new ClickSongStore();
        System.out.println("请输入用户名");
        Scanner userNameSc = new Scanner(System.in);
        clickSongSys.welcome(userNameSc.next());
    }
}

class ClickSongStore {
    static public String storeName;
    private LinkedList songStore = new LinkedList();
    static private String userNameInStore;
    public void welcome(String userName){
        System.out.println("欢迎"+userName+"来到"+storeName);
        userNameInStore = userName;
        this.clickSong(userName);
    }
    public void clickSong(String userName){
        System.out.println("0:点歌，1：删除置顶歌曲，2：移到顶部, 3: 移到底部");
        Scanner userInputSc = new Scanner(System.in);
        handleInput(userInputSc.nextInt(), userName);
    }
    public void handleInput(int userInput, String userName){
        switch (userInput){
            case 0:
                this.addSong();
                break;
            case 1:
                this.deleteSong();
            case 2:
                this.turnToTop();
                break;
            case 3:
                this.turnToBottom();
                break;
            default:
                this.welcome(userName);
                break;
        }
    }

    public void addSong(){
        System.out.println("请点歌");
        Scanner addSc = new Scanner(System.in);
        this.songStore.add(addSc.next());
        this.showSong();
        this.clickSong(userNameInStore);
    }
    public void deleteSong(){
        Scanner addSc = new Scanner(System.in);
        this.songStore.remove(addSc.nextInt());
        this.showSong();
        this.clickSong(userNameInStore);
    }
    public void showSong(){
        Iterator songIt = this.songStore.iterator();
        int i = 0;
        while (songIt.hasNext() && i < this.songStore.size() ){
            System.out.println(i+":"+this.songStore.get(i));
            i ++;
        }
    }
    public void turnToTop(){
        Scanner turnTop = new Scanner(System.in);
        System.out.println("请选择需要置顶的歌的序号");
        int turnTopInput = turnTop.nextInt();
        this.songStore.addFirst(this.songStore.get(turnTopInput));
        this.songStore.remove(turnTopInput+1);
        this.showSong();
        this.clickSong(userNameInStore);
    }
    public void turnToBottom(){
        Scanner turnBottom = new Scanner(System.in);
        this.songStore.addLast(this.songStore.get(turnBottom.nextInt()));
        this.showSong();
        this.clickSong(userNameInStore);
    }
}

class ClickUser {
    private String userName;
    public ClickUser(String userName){
        this.userName = userName;
    }
}
