public class Pizza
{
	private String size;
	private String [] toppings;
	private double price;
	public Pizza(String size,String [] toppings)
	{
		this.size=size;
		this.toppings=toppings;
		this.price=0.0;
	}
	public String getSize()
	{
		return this.size;
	}
	public double getPrice()
	{
		return this.price;
	}
	public double calcCost()
	{
		if(size.equals("small"))
			return price+10+2*toppings.length;
		else if(size.equals("medium"))
			return price+12+2*toppings.length;
		else
			return price+14+2*toppings.length;
		
	}
	public String displayInfo()
	{
		String tharu="";
		for(int i=0;i<toppings.length;i++)
		{
			tharu += toppings[i]+",";
		}
		return("Pizza size = "+this.size+"\nPizza toppings = "+tharu+"\nPizza price = "+calcCost());
	}
}