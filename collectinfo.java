package javaPack;

import java.util.Scanner;

public class CollectInfo 
{
	String fname,lname;
	int gpa=0;
	Scanner allinput = new Scanner(System.in);
	
	public CollectInfo()
	{
		AllInfo();
	}
	
	public void AllInfo()
	{
		System.out.print("Enter your first name: ");
		fname = allinput.nextLine();
		
		System.out.print("Enter your middle initial");
		String midinit = allinput.nextLine();
		
		fname = fname + midinit;
		
		System.out.print("Enter your last name: ");
		lname =  allinput.nextLine();
		
		System.out.print("Enter your first grade:  ");
		grade1 = allinput.nextInt();
		
		System.out.print("Enter your second grade:  ");
		grade2 = allinput.nextInt();
		
		System.out.print("Enter your third grade:  ");
		grade3 = allinput.nextInt();
		
		System.out.print("Enter your fourth grade:  ");
		grade4 = allinput.nextInt();
		
		System.out.print("Enter your fifth grade:  ");
		grade5 = allinput.nextInt();
		
		System.out.print("Enter your sixth grade:  ");
		grade6 = allinput.nextInt();
		
		System.out.print("Enter your seventh grade:  ");
		grade7 = allinput.nextInt();
		
		System.out.print("Enter your eigth grade:  ");
		grade8 = allinput.nextInt();
		
		Person collectpers = new Person(fname,lname,persongpa);
		String fullname  = collectpers.Fullname();
		int pers
		
		
		
	}
	
}
