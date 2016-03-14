import java.io.*;
import java.util.Scanner;

public class Student {
	private String first, last, address, phoneNumber;
	private int credits, num;
	private static int numberOfStudents;
	private double tuition, lateFee, food, healthCare, incedental, total;
	private String instate, lateFee1, food1, healthCare1;

	
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner (System.in);
		University clerk = new University ();
		Student person = new Student();
		int i, count;
		System.out.println("Enter number of students: ");
		numberOfStudents = keyboard.nextInt();
		for (i = 0; i < numberOfStudents; i++)
		{
			person.readInput();
			person.calculateData();
			person.writeOutput();
			clerk.collectDataForReport(person);
		}
		clerk.printDataForSchoolReport();
	}
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
	public boolean lateFee()
	{
		if (lateFee1.equalsIgnoreCase("yes"))
		{
			return true;
		}
			
		else 
			return false;
	}
	public boolean healthCare()
	{
		if (healthCare1.equalsIgnoreCase("yes"))
		{
			return true;
		}
			
		else
			return false;
	}
	
	public boolean instateStudents()
	{
		if (instate.equalsIgnoreCase("yes"))
		{
			return true;
		}
			
		else
			return false;
	}
	
	public boolean foodoption1()
	{
		if ((food1.equalsIgnoreCase("yes")&&(num == 1)))
		{
			return true;
		}	
		else 
			return false;
	}
	public boolean foodoption2()
	{
		if ((food1.equalsIgnoreCase("yes")&&(num == 2)))
		{
			return true;
		}
			
		else 
			return false;
	}
	public boolean foodoption3()
	{
		if ((food1.equalsIgnoreCase("yes")&&(num == 3)))
			{
				return true;
			}
		else 
			return false;
	}
	public double getfood1()
	{
		double food1 = 4999;
		return food1;
	}
	public double getfood2()
	{
		double food2 = 3499;
		return food2;
	}
	public double getfood3()
	{
		double food3 = 2599;
		return food3;
	}
	
	public void readInput()
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.println("");
		System.out.println("First name: ");
		first = keyboard.nextLine();
		System.out.println("Last name: ");
		last = keyboard.nextLine();
		System.out.println("Address: ");
		address = keyboard.nextLine();
		System.out.println("Phone Number: ");
		phoneNumber = keyboard.nextLine();
		System.out.println("Qualifies for instate rate? ");
		instate = keyboard.nextLine();
		System.out.println("Late fee assessed? ");
		lateFee1 = keyboard.nextLine();
		System.out.println("On campus food? ");
		food1 = keyboard.nextLine();
		calcFood();
		System.out.println("Health care option? ");
		healthCare1 = keyboard.nextLine();
		System.out.println("Credits enrolled: ");
		credits = keyboard.nextInt();
		System.out.println(" ");
		
	}
	public void calculateData()
	{
		calcTuition();
		calclateFee();
		calcIncedental();
		calchealthCare();
		calcTotal();
		
	}
	public double calcTuition()
	{
		if ((credits < 12)&&(instate.equalsIgnoreCase("yes")))
		{	
			tuition = 102.50 * credits;						
		}
		else if ((credits < 12)&&(instate.equalsIgnoreCase("no")))
		{
			tuition = 351.00 * credits;		
		}
		else if ((credits > 12)&&(credits <18)&&(instate.equalsIgnoreCase("yes")))
		{
			tuition = (102.50 * 11) + ((credits -11) * 75.45);	
		}
		else if ((credits > 12)&&(credits <18)&&(instate.equalsIgnoreCase("no")))
		{
			tuition = (351.00 * 11) + ((credits -11) * 255.0);	
		}
		else if ((credits > 18)&&(instate.equalsIgnoreCase("yes")))
		{
			tuition = (102.50 * 11) + (75.45 * 7) + ((credits - 18)* 93.0);
		}
		else if ((credits > 18)&&(instate.equalsIgnoreCase("no")))
		{
			tuition = (351.0 * 11) + (255.0 * 7) + ((credits - 18)* 304.0);
		}
		else
		{
			System.out.println("invalid");
		}
			
		return tuition;
	}
	
	public double calclateFee()
	{
		if (lateFee1.equalsIgnoreCase("yes"))
		{
			lateFee = tuition * 0.1;
		}
		else
		{
			lateFee = 0;
		}
		return lateFee;
	}
	public double calcIncedental()
	{
		if (credits < 12)
		{
			incedental = credits * 20;
		}
		else if (credits > 12)
		{
			incedental = 250;
		}
		return incedental;
	}
	
	public double calchealthCare ()
	{
		if ((credits <= 10)&&(healthCare1.equalsIgnoreCase("yes")))
		{
			healthCare = 25 * credits;
		}
		else if ((credits > 15)&&(healthCare1.equalsIgnoreCase("yes")))
		{
			healthCare = (25*10) + (20*5) + ((credits - 15) * 15);
		}
		else if ((credits > 10)&&(credits < 15)&&(healthCare1.equalsIgnoreCase("yes")))
		{
			healthCare = (25*10) + ((credits - 10) * 20);
		}
		else
		{
			healthCare = 0;
		}
		return healthCare;
	}
	public double calcFood()
	{
		Scanner keyboard = new Scanner(System.in);
		
		if ((food1.equalsIgnoreCase("yes")))
		{
			System.out.println("choose a meal plan: ");
			System.out.println("Enter [1] for Meal Plan stuff-your-face");
			System.out.println("Enter [2] for Meal Plan I-can't-stand-this-food");
			System.out.println("Enter [3] for Meal Plan I'm-on-a-diet");
			num = keyboard.nextInt();
			if (num == 1)
			{
				food = 4999;
			}
			else if (num == 2)
			{
				food = 3499;
			}
			else if (num == 3)
			{
				food = 2599;
			}
			else 
			{
				food = 0;
			}
		}
		return food;
	}
	
	private double calcTotal()
	{
		total = tuition + lateFee + incedental + healthCare + food;
		return total;
	}
	public void writeOutput()
	{
		System.out.println("NAME: " + first + " " + last);
		System.out.println("ADDRESS: " + address);
		System.out.println("PHONE: " + phoneNumber);
		System.out.println("CREDITS: " + credits);
		System.out.println("TUITION: $" + tuition );
		System.out.println("LATE FEE: $" + lateFee );
		System.out.println("INCEDENTAL: $" + incedental);
		System.out.println("HEALTH CARE: $" + healthCare);
		System.out.println("MEAL PLAN: $" + food);
		System.out.println("TOTAL: $" + total);
		System.out.println("**************************");
	}
	
	
}


