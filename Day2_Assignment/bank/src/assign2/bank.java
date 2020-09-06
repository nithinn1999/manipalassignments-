package assign2;

public class bank {

	private int id;
	private String name;
	private double balance=0;
	
	public bank(int id, String name) {
		this.id = id;
		this.name = name;
		this.balance= 0.0;
	}
	
	public double credit(double balance) {
		this.balance += balance;
		return this.balance;
	}
	
	public double debit(double balance) {
		if(this.balance < balance)
			{
				System.out.println("insufficient balance");
			}
		else
		{
		this.balance -= balance;
		return this.balance;
		}
		return 0;
	}
}
