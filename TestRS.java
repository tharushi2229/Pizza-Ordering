public class TestRS
{
	public static void main (String args[])
	{
		String [] rtoppings={"cheese","chicken"};
		String [] stoppings={"onion"};
		RegularPizza r1=new RegularPizza("medium",rtoppings);
		SpecialPizza s1=new SpecialPizza("small",stoppings,"tomato Sourse");
		System.out.println(r1.displayInfo());
		System.out.println();
		System.out.println(s1.displayInfo());
	}
}