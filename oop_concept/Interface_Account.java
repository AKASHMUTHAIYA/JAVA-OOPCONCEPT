package oop_concept;
import java.util.Scanner;
interface Bank
{
	void deposite(double amt);
	void withdraw(double amt);
}
 class Accounts implements Bank{
	 double account_no;
	 int cur_bal;
    
	public Accounts(double account_no,int cur_bal ) {
		super();
		this.cur_bal = cur_bal;
		this.account_no = account_no;
	}

	@Override
	public void deposite(double amount) {
		System.out.println("The current balance: "+cur_bal);
		cur_bal+=amount;
		System.out.println("The remaining balance: "+cur_bal);
		
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("The current balance: "+cur_bal);
		cur_bal-=amount;
		System.out.println("withdrawing : "+amount);
		System.out.println("The remaining balance: "+cur_bal);		
	}
	
}

public class Interface_Account {

	public static void main(String[] args) {
         Accounts s= new Accounts(1234563,120000);
         System.out.print("your are withdrawing : ");
         Scanner sc= new Scanner(System.in);
         double n=sc.nextInt();
         s.withdraw(n);
         sc.close();
         
         
         
	}

}
