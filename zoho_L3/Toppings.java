package burger.shop;

public class Toppings 
{
	private int id;
	private String type;
	private double price;
	
	public Toppings(int id,String type,double price)
	{
		this.id = id;
		this.type=type;
		this.price=price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getType()
	{
		return type;
	}

}
