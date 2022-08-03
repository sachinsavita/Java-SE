package Intro;

class ATM
{
	synchronized public void checkBalance(String name)
	{
		System.out.println("Checking "+name+"'s account balance...");
		try{Thread.sleep(10000);} catch(Exception e) {}
		System.out.print(name+"'s account balance is: ");
		System.out.println("20,000");
	}
	 synchronized public void withdraw(String name, float amount)
	{
		System.out.println("Withdrawing from "+name+ "'s account:");
		System.out.println("Processing......");
		try{Thread.sleep(10000);} catch(Exception e) {}
		System.out.println("From "+name+"'s account withdrawl amount is: "+amount);
		
	}
}


//customer classes
class Customer1 extends Thread
{
	ATM atm;
	String name;
	int amount;
	public Customer1(String name, int amount, ATM atm){
		this.atm = atm;
		this.name = name;
		this.amount = amount;
	}
	public void run()
	{
		atm.checkBalance(name);
		atm.withdraw(name, amount);
	}
	
}

//customer class
class Customer2 extends Thread
{
	ATM atm;
	String name;
	int amount;
	public Customer2(String name, int amount, ATM atm){
		this.atm = atm;
		this.name = name;
		this.amount = amount;
	}
	public void run()
	{
		atm.checkBalance(name);
		atm.withdraw(name, amount);
	}
	
}


//Test
public class ATMSyncDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM atm = new ATM();
		
		Customer1 c1 = new Customer1("Raam",2000, atm);
		
		Customer2 c2 = new Customer2("Shyaam", 5000, atm);
		
		c1.start();
		c2.start();

	}

}
