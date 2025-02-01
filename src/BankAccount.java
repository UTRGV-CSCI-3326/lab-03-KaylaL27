public class BankAccount{
    public static void main(String[] args){
        double balance = 2175.37;

        balance -= 302.5; //frist withdraw
        balance += 50.03; //first deposit
        balance /= 2; // second withdraw
        balance += 20; //second deposit
        balance -= 1; // third withdraw
        balance *= 2; //third deposit
        balance += 1; //fourth deposit
         
        //use string format to print balance with 2 decimal places
        System.out.println("Final balance: " + String.format("%.2f", balance));
    }
}
