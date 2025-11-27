package Company_Employee;

public class Employee {
	private static int counter = 0;
	private int id;
	private String name;
	private String email;
	private int contact;
	private int salary;
	
	public Employee()
	{
		counter++;
		id = counter;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	
	
	public void setEmail(String e)
	{
		email = e;
	}
	public String getEmail()
	{
		return email;
	}
	
	public void setContact(int c)
	{
		contact = c;
	}
	public int getContact()
	{
		return contact;
	}
	
	public void setSalary(int s)
	{
		salary = s;
	}
	public int getSalary()
	{
		return salary;
	}
	
	public void display() 
	{
	    System.out.printf("%-5d %-10s %-20s %-15d %-10d%n", id, name, email, contact, salary);
	}

}
