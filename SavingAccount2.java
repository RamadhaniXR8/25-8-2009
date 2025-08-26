
public class SavingAccount2 {public String name;
    public double balance;
    public double interestRate;
    

  public void displayCustomer() {
        
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + (interestRate * 100) + "%");
  }

  public void deposit(int  x) {
    if (x <= 0) {
        System.out.println("Peringatan: Jumlah setoran harus positif");
        return;
    }
    balance += x;
    System.out.println("Setor ; " + x + " | " + "Saldo sekarang ; "+balance);
}

public void withdraw(double y) {
    if (y <= 0) {
        System.out.println("Peringatan: Jumlah penarikan tidak boleh negatif");
        return;
    }
    if (y > balance) {
        System.out.println("Peringatan: Saldo terlalu rendah!");
}
balance -= y;
    System.out.println("Tarik ; " + y + " | " + "Saldo sekarang ; "+balance);
}
//Hitung bunga bulanan (Misalnya bunga tahunan dibagi 12)
public double calcInterest() {
    double interest = balance * interestRate / 12;
    balance += interest; //langsung ditambahkan ke saldo

    System.out.println("Tambahan bunga: " + interest+ " | " + "Saldo sekarang: " + balance);
    return interest;
}
}


