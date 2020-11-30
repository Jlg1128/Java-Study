package muitThread;

public class MutiThead {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        new Thread(myThread, "窗口1").start();
        new Thread(myThread, "窗口2").start();
        new Thread(myThread, "窗口3").start();
        new Thread(myThread, "窗口4").start();
    }
}
class MyThread implements Runnable {
    public int totalTickey = 10;
    Object lock = new Object();
    public void run(){
        while (true){
            char a = 'q';
            System.out.println((int) 'q');
            this.sale();
        }
    }
    public synchronized void sale(){
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        if(this.totalTickey <= 0){
            System.exit(0);
        }
        System.out.println(Thread.currentThread().getName() + "还剩" + this.totalTickey + '票');
        this.totalTickey --;
    }
}
