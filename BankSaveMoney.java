import java.util.Scanner;

public class BankSaveMoney {
    public static void main(String[] args){
        Client cl = new Client("jlg1");

        new Thread(cl, "手机端").start();
        new Thread(cl, "电脑端").start();
    }
}
class BankNew {
    private int userMoney;
    public BankNew(int userMoney){
        this.userMoney = userMoney;
        System.out.println("余额" + userMoney + "元");
    }
    public synchronized void save(int saveCount){
        System.out.println("请输入存款金额，q键退出");
            if(saveCount == 113){
                System.exit(0);
            }
            this.userMoney += saveCount;
            System.out.println(this.userMoney);
    }
}
class Client implements Runnable{
    private String username;
    private BankNew bank = new BankNew(1000);
    public Client(String username){
        this.username = username;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i =0; i< 3; i ++){
            bank.save(300);
        }
    }
}

