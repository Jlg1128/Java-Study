import java.util.Scanner;

public class Trade{
    public static void main(String[] args) throws Exception{
        Bank.BankName = "杭州银行";
        Bank.welCome();
        Bank b1 = new Bank("jlg",   1000.00f );
        b1.Operation();
    }
}