import java.util.Scanner;

public class AccountTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println(" Bank rekening");
       SavingAccount2 account = new SavingAccount2();
       account.name = "Zhafir";
         account.balance = 1000;
         account.interestRate = 0.05;// 5% per tahun

         account.displayCustomer();
        account.deposit(500);
account.withdraw(200);
account.calcInterest();//tambahkan  bunga

System.out.println();

SavingAccount2 account1 = new SavingAccount2();
account1.name = "Habib";
account1.balance = 2000;
account1.interestRate = 0.03; // 3% per tahun


         account1.displayCustomer();
        account1.deposit(500);
account1.withdraw(200);
account1.calcInterest();//tambahkan  bunga
    
}
}