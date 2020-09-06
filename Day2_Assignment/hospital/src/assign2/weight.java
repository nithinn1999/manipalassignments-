package assign2;

public class weight {
	
	float num;
	
		public weight(float num) {
		super();
		this.num = num;
	}

		public String calc(float num)
	{
		if(num >= 2.5 && num <= 4.5)
		{
			return("New born baby is healthy");
		}
		else if (num < 2.5)
		{
			return("undernurished");
		}
		else 
		{
			return("overnurished");
		}
	}
}
