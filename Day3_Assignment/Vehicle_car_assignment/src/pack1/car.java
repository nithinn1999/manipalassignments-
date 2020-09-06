package pack1;

public class car extends Vehicle{
	private int maxSpeed;
	private String type;	
	
	public car(int regNo, String model, int currSpeed, int maxSpeed, String type) {
		super(regNo, model, currSpeed);
		this.maxSpeed = maxSpeed;
		this.type = type;
	}

	@Override
	public String increaseSpeed(int n) {
		if ((currSpeed+n < maxSpeed))
		{
			return (Integer.toString(currSpeed+n));
		}
		else
			return ("Car stopped(reached maximum speed)");
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
}
