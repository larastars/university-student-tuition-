
public class University {
	private int foodoption1 = 0;
	private int foodoption2 = 0;
	private int foodoption3 = 0;
	private double totalfood = 0;
	private int instateStudents=0;
	private int outofstateStudents=0;
	private double totalfood1 = 0;
	private double totalfood2 = 0;
	private double totalfood3 = 0;
	private double incedental = 0;
	private double tuition = 0;
	private double latefee = 0;
	private double healthcare = 0;
	private double finaltotal = 0;
	
	Student student1 = new Student();
	
	public void collectDataForReport(Student person)
	{
		
			if (person.instateStudents())
			{
				instateStudents ++;
			}
			else
			{
				outofstateStudents++;
			}
			
			if (person.foodoption1())
			{
				totalfood1 = totalfood1 + person.getfood1();
				foodoption1++;
			}
			else if (person.foodoption2())
			{
				totalfood2 = totalfood2 + person.getfood2();
				foodoption2++;
			}
			else if (person.foodoption3())
			{
				totalfood3 = totalfood3 + person.getfood3();
				foodoption3++;
			}
			totalfood =  totalfood1 + totalfood2 + totalfood3;
			tuition = tuition + person.calcTuition();
			
			if (person.lateFee())
			{
				latefee = latefee + person.calclateFee();
			}
			
			incedental =incedental + person.calcIncedental();
			
			if (person.healthCare())
			{
				healthcare = healthcare + person.calchealthCare();
			}
			
			finaltotal = healthcare +latefee + incedental + totalfood + tuition ;
	}

	public void printDataForSchoolReport()
	{
		System.out.println("");
		System.out.println("*************UNIVERSITY OF COMPUTERS*************");
		System.out.println("NUMBERS OF STUDENTS: " + student1.getNumberOfStudents());
		
		System.out.println("INSTATE: " + instateStudents);
		System.out.println("OUT OF STATE: " + outofstateStudents);
		System.out.println("MEAL PLAN: ");
		System.out.println("             " + "STUFF-YOUR-FACE " + foodoption1 +" $" + totalfood1 );
		System.out.println("             " + "I-CAN'T-STAND-THIS-FOOD " + foodoption2 +" $" + totalfood2);
		System.out.println("             " + "I'M-ON-A-DIET " + foodoption3 +" $"+ totalfood3);
		System.out.println("                          " + "FOOD SUB TOTAL $" + totalfood);
		System.out.println("TUITION: $" + tuition);
		System.out.println("LATE FEE: $" + latefee);
		System.out.println("INCEDENTAL: $" + incedental);
		System.out.println("HEALTH CARE: $" + healthcare);
		System.out.println("                                TOTAL: $" + finaltotal);
		
	}
	
}
