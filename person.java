package javaPack;

public class Person 
{
	private String firstname;
	private String lastname;
	private int grade1;
	private int grade2;
	private int grade3;
	private int grade4;
	private int grade5;
	private int grade6;
	private int grade7;
	private int grade8;
	private int usersgpa;
	
	public Person(String fname, String lname, int userdob)
	{
		this.firstname = fname;
		this.lastname = lname;
		this.usersgpa = usergp;
	}
	
	public String Fullname()
	{
		String completename = firstname + " " + lastname;
		return completename;
	}
	
	public String FullnameUpper()
	{
		String upperfullname = Fullname().toUpperCase();
		return upperfullname;
	}
	
	public int Fullnamelength()
	{
		int fullnamelen = Fullname().length();
		return fullnamelen;
	}
	
	public int 1stgrade()
	{
		int grade1 =  
	}
	
	
	
	
	public int Persongpa()
	{
		int gpaofperson;
		gpaofperson = 2025 - userbirthyr;
		return gpaofperson;
		
	}

}
