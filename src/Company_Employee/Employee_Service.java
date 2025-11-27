package Company_Employee;

import java.util.*;
public class Employee_Service {
	private Employee emp[] = new Employee[50];
	private int count = 0;
	private Scanner sc = new Scanner(System.in);
	
	public void addEmployee()
	{
		if(count < emp.length)
		{
			emp[count] = new Employee();
			//sc.nextLine();
			System.out.println("Enter the Employee Name: ");
			emp[count].setName(sc.next());
			
			sc.nextLine();
			System.out.println("Enter the Employee Email: ");
			emp[count].setEmail(sc.next());
			
			System.out.println("Enter the Employee Contact: ");
			emp[count].setContact(sc.nextInt());
			
			System.out.println("Enter the Employee Salary: ");
			emp[count].setSalary(sc.nextInt());
			
			count++;
		}
		else
		{
			System.out.println("There is no Space to enter the Data: ");
		}
	}
	
	public void disAllEmployee()
	{
		if(count == 0)
		{
			System.out.println("No Employee data Available");
		}
		System.out.printf("%-5s %-10s %-20s %-15s %-10s%n", "Id", "Name", "Email", "Contact", "Salary");

		for(int i = 0; i < count; i++)
		{
			emp[i].display();
		}
	}
	
	public void displayById()
	{
		System.out.println("Enter the Employee Id: ");
		int id = sc.nextInt();
		boolean found = true;
		for(int i = 0; i < count; i++)
		{
			if(emp[i].getId() == id)
			{
				emp[i].display();
				found = false;
			}
		}
		if(found)
		{
			System.out.println("This Id not match with any Employee Id");
		}
	}
	
	public void updateByName()
	{
		System.out.println("Enter the Present Employee Name: ");
		String name = sc.next();
		boolean found = true;
		for(int i = 0; i < count; i++)
		{
			if(emp[i].getName().equalsIgnoreCase(name))
			{
				System.out.println("Enter the Increment Salary: ");
				emp[i].setSalary(sc.nextInt());
				
				found = false;
				System.out.println("Salary Update Successfully");
				break;
			}
		}
		if(found)
		{
			System.out.println("Employee Name not Found");
		}
	}
	
	public void deleteByEmail()
	{
		System.out.println("Enter the Present Employee Email: ");
		String email = sc.next();
		boolean deleted = true;
		for(int i = 0; i < count; i++)
		{
			if(emp[i].getEmail().equalsIgnoreCase(email))
			{
				for(int j = i; j < count; j++)
				{
					emp[j] = emp[j+1];
				}
				count--;
				deleted = false;
				System.out.println("Employee Details Deleted");
				break;
			}
		}
		if(deleted)
		{
			System.out.println("Employee Not Found");
		}
	}
	
	public void displayCount()
	{
		System.out.println("Display list count of the Employee in Company: "+count);
	}
	
	public void sortEmployee()
	{
		for(int i = 0; i < count; i++)
		{
			for(int j = i; j < count; j++)
			{
				if(emp[i].getSalary() > emp[j].getSalary())
				{
					Employee temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
		}
		System.out.println("Employee's Sorted ascending order of Salary: ");
		disAllEmployee();
	}
	
	public void highSalary()
	{
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < count; i++)
		{
			if(emp[i].getSalary() > max)
			{
				max = emp[i].getSalary();
			}
		}
		
		boolean found = true;
		for(int i = 0; i < count; i++)
		{
			if(emp[i].getSalary() == max)
			{
				emp[i].display();
				found = false;
			}
		}
		if(found)
		{
			System.out.println("No Salary match with any Employee");
		}
	}
	
	public void minSalary()
	{
		boolean flag = true;
		for(int i = 0; i < count; i++)
		{
			if(emp[i].getSalary() <10000 && emp[i].getSalary() > 60000)
			{
				emp[i].display();
				flag = false;
			}
		}
		if(flag)
		{
			System.out.println("No Employee Found");
		}
	}
}
