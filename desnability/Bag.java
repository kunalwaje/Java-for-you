package desnability;

import java.util.Scanner;

public class Bag {
	Pen p;
	Scanner sc= new Scanner (System.in);
	public void addPen()
	{
		if(p==null)
		{
			System.out.println("Enter Pen Name :");
			String penname=sc.next();
			System.out.println("Enter Pen Color :");
			String pencolor=sc.next();
			System.out.println("Enter Pen Price :");
			double price=sc.nextDouble();
			p=new Pen(penname,pencolor,price);
			System.out.println("Pen is Added!!!");
		}
		else
		{
			System.out.println("alreday pen is existing");
		}
		
	}
	public void removePen()
	{
		if(p==null)
		{
			System.out.println("Please add pen first!");
		}
		else
		{
			System.out.println(p.penName);
			System.out.println(p.penColor);
			System.out.println(p.penPrice);
			
		}
	}
	public void displayPen()
	{
		if(p==null)
		{
			System.out.println("Please add pen first!");
		}
		else
		{
			System.out.println(p.penName);
			System.out.println(p.penColor);
			System.out.println(p.penPrice);
			
		}
	}

}
