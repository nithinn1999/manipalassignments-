package proj1;

public class player {
	private Dice d1;
	private Dice d2;
	

	public player() {
		super();
		d1 = new Dice();
		d2 = new Dice();
	}
	
	public int play()
	{	
		int l1 = d1.roll();
		System.out.println("Vlue of dice on first roll:" + l1);
		int l2 = d2.roll();
		System.out.println("Vlue of dice on second roll:" + l2);
		return(l1+l2);
	}

	public Dice getD1() {
		return d1;
	}

	public void setD1(Dice d1) {
		this.d1 = d1;
	}

	public Dice getD2() {
		return d2;
	}

	public void setD2(Dice d2) {
		this.d2 = d2;
	}
	
}
