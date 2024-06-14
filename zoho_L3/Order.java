package burger.shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Order 
{
	private Scanner x;
	private Crust cr[];
	private Filling fg[];
	private Toppings tp[];
	private List<List<String>> orderlist;
	public Order()
	{
		cr = new Crust[3];
		fg = new Filling[3];
		tp = new Toppings[4];
		orderlist = new ArrayList<>();
		x = new Scanner(System.in);
		initializeBurger();
		System.out.println("-----> Welcome to BurgerShop <-----");
	}
	
	public void initializeBurger()
	{
		cr[0]= new Crust(1,"Hard",10);
		cr[1]= new Crust(2,"Thin",10);
		cr[2]= new Crust(3,"Soft",12);
		
		fg[0]= new Filling(1,"Chicken Tikka",120);
		fg[1]= new Filling(2,"Paneer Tikka",100);
		fg[2]= new Filling(3,"Turkey Meat",130);
		
		tp[0]= new Toppings(1,"Cucumber",25);
		tp[1]= new Toppings(2,"Tomato",20);
		tp[2]= new Toppings(3,"Meat strip",45);
		tp[3]= new Toppings(4,"Cabbage",20);
	}
	public void burgerOff()
	{
		Random r= new Random();
		orderlist.add(new ArrayList<>());
		int rand = r.nextInt(0,3);
		orderlist.get(orderlist.size()-1).add("\n---> Crust <---\n"+cr[rand].getType()+"\t"+cr[rand].getPrice());
		double total = cr[rand].getPrice();
		
		rand = r.nextInt(0,3);
		orderlist.get(orderlist.size()-1).add("\n---> Fillings <---\n"+fg[rand].getType()+"\t"+fg[rand].getPrice());
		total += fg[rand].getPrice();
		
		int fill=rand;
		rand = r.nextInt(0,4);
		
		while(fill==1 && rand==2)
		{
			rand = r.nextInt(0,4);
		}
		
		orderlist.get(orderlist.size()-1).add("\n---> Toppings <---\n"+tp[rand].getType()+"\t"+tp[rand].getPrice());
		total += tp[rand].getPrice();
		orderlist.get(orderlist.size()-1).add("Total\t=\t"+String.valueOf(total));
	}
	
	public void menu()
	{
		
		System.out.println("1.order burger of the day\n2.order ur own burger\n3.exit ");
		System.out.println("Enter ur choice: ");
		int ch = Integer.valueOf(x.nextLine());
		switch(ch)
		{
		case 1:
			burgerOff();
			invoice();
			break;
		case 2:
			ownBurger();
			invoice();
			break;
		case 3:
			System.out.println("---> Thank You! Visit Again!! <---");
			System.exit(0);
		}
		
	}
	
	private void invoice()
	{
		System.out.println("\n---> Your Bill <---\n");
		for(String s:orderlist.get(orderlist.size()-1))
		{
			System.out.println(s+"\n");
		}
		
		System.out.print("Do u want to continue? (y/n): ");
		String c = x.nextLine();
		if(c.equals("y"))
			menu();
		else
		{
			System.out.println("\n\n---> Thank You! Visit Again!! <---");
			System.exit(0);
		}
	}
	
	private void ownBurger()
	{
		orderlist.add(new ArrayList<>());
		
		System.out.println("---> Crust Types <---");
		System.out.println("1.Hard\tRs.10\n2.Thin\tRs.10\n3.Soft\tRs.12");
		System.out.println("Enter ur choice: ");
		int num=Integer.valueOf(x.nextLine())-1;
		orderlist.get(orderlist.size()-1).add("\n---> Crust <---\n"+cr[num].getType()+"\t"+cr[num].getPrice());
		double total = cr[num].getPrice();
		
		System.out.println("---> Filling Types <---");
		System.out.println("1.Chicken Tikka\tRs.120\n2.Paneer Tikka\tRs.100\n3.Turkey Meat\tRs.130");
		num=Integer.valueOf(x.nextLine())-1;
		orderlist.get(orderlist.size()-1).add("\n---> Fillings <---\n"+fg[num].getType()+"\t"+fg[num].getPrice());
		total += fg[num].getPrice();
		
		int fill = num;
		int tpc =0;
		List<Double> t = new ArrayList<>();
		System.out.println("Do u want toppings? (y/n): ");
		
		String ch = x.nextLine();
		while(true)
		{	
			if(ch.equals("n"))
			{
				break;
			}
			else
			{
				orderlist.get(orderlist.size()-1).add("\n---> Toppings <---\n");
				System.out.println("---> Toppings Types <---");
				System.out.println("1.Cucumber\tRs.25\n2.Tomato\tRs.20\n3.Meat strip\tRs.45\n4.Cabbage\tRs.20");
				System.out.println("Enter ur choice: ");
				num=Integer.valueOf(x.nextLine())-1;
				
				if(num==2 && fill==1)
				{
					System.out.println("Veg Burger cannot be combined with Meat Toppings! Try another choice!");
				}
				else
				{
					tpc++;
					orderlist.get(orderlist.size()-1).add(tp[num].getType()+"\t"+tp[num].getPrice());
					total += tp[num].getPrice();
					t.add(tp[num].getPrice());
					
					if(tpc==3)
					{	
						total -= Collections.min(t);
						System.out.println("\n--> Congrats u got a free topping!!");
					}
					
					if(tpc<3)
					{
						
						System.out.println("Do u want another topping? (y/n): ");
						String c = x.nextLine();
						if(c.equals("n"))
						{
							break;
						}
					}
					else
					{
						System.out.println("Maximum Topping Limit Reached!!");
						break;
					}
				}
			}
			
		}
		orderlist.get(orderlist.size()-1).add("Total\t=\t"+String.valueOf(total));
		
	}
}
