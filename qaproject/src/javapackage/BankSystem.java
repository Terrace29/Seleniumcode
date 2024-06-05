package javapackage;

public class BankSystem {
	
	BankSystem(String username,String pass)
	{
		System.out.println(username+ " "+pass);
	}
	
	int amt =2000;
	void deposit()
	{
		System.out.println("The amount after deposit");
	}
	void withdraw()
	{
		System.out.println("The amount after withdraw");
	}
	int display()
	{
		return amt;
		
	}

	public static void main(String[] args) {
		// Create a object of class
		BankSystem obj= new BankSystem("Lavanya","12344");
		obj.deposit();
		obj.withdraw();
		System.out.println(obj.display());

	}

}
