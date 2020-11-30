import java.util.Scanner;

public class Bank {
        String userName;
        float totalMoney;
        static String BankName;
        public Bank(String userName, float totalMoney){
            this.userName = userName;
            this.totalMoney = totalMoney;
//            this.saveMoney = saveMoney;
        }
        void Operation(){
        System.out.println("请输入你选择的交易类型");
        System.out.println("1.存款 2.取款 3.查看余额");
        Scanner MonneyOpera = new Scanner(System.in);
            this.DoChooeseOpera(MonneyOpera.nextInt());
        }
        void DoChooeseOpera(int OperaType){
        switch (OperaType){
            case 1:
                this.Cunkuan();
                return;
            case 2:
                this.Qukuan();
                return;
            case 3:
                this.showTotal();
                return;
            default:
                this.showTotal();
        }
        }
        void Cunkuan(){
            System.out.println("请输入存款金额");
            Scanner SaveMoneySc = new Scanner(System.in);
            float value = SaveMoneySc.nextFloat();
            this.quit(Float.toString(value));
            this.totalMoney += value;
            this.showTotal();
            this.Operation();
        };
        void Qukuan(){
            System.out.println("请输入取款金额");
            Scanner LeftMoneySc = new Scanner(System.in);
            float value = LeftMoneySc.nextFloat();
            this.quit(Float.toString(value));
            this.totalMoney -= (int)value;
            this.showTotal();
            this.Operation();
        }
        void showTotal(){
            System.out.println("余额总共有" + this.totalMoney);
            this.Operation();
        }
        void quit(String quitSignal){
            System.out.println(quitSignal);
            if(quitSignal == "exit"){
                return ;
            }
        }
        static void welCome(){
           System.out.println(BankName + "欢迎你");
        }
}

