/*Q2. Write a menu driven program in java to Create a class name as Employee to hold 
 * empid, empname , empemail , empcontact and empsalry. The menu options should be: 
 * 1. Add Employee Details. 
 * 2. Display All Employee Details.
 * 3. Search Employee By Id then employee is found or not. 
 * 4. Update Employee Details By Name. 
 * 5. Delete Employee Details By Email. 
 * 6. Display list count of the Employee in Company. 
 * 7. Display list the employee in the ascending order of employee salary. 
 * 8. Display the employee details in highest salary. 
 * 9. Display the employee details in minimum salary is 10000 to maximum salary is 60000. 
 * 10. Exit.*/

package Company_Employee;

import java.util.*;
public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee_Service operation = new Employee_Service();
		
		int choice;
		do
		{
			System.out.println("\n====== Company Menu ======");
            System.out.println("1. Add Employee Details. ");
            System.out.println("2. Display All Employee Details.");
            System.out.println("3. Search Employee By Id then employee is found or not.");
            System.out.println("4. Update Employee Details By Name. ");
            System.out.println("5. Delete Employee Details By Email. ");
            System.out.println("6. Display list count of the Employee in Company. ");
            System.out.println("7. Display list the employee in the ascending order of employee salary. ");
            System.out.println("8. Display the employee details in highest salary. ");
            System.out.println("9. Display the employee details in minimum salary is 10000 to maximum salary is 60000. ");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            
            switch(choice)
    			{
    				case 1:
    					operation.addEmployee();
    					break;
    				
    				case 2:
    					operation.disAllEmployee();
    					break;
    					
    				case 3:
    					operation.displayById();
    					break;
    				
    				case 4:
    					operation.updateByName();
    					break;
    				
    				case 5:
    					operation.deleteByEmail();
    					break;
    					
    				case 6:
    					operation.displayCount();
    					break;
    				
    				case 7:
    					operation.sortEmployee();
    					break;
    					
    				case 8:
    					operation.highSalary();
    					break;
    					
    				case 9:
    					operation.minSalary();
    					break;
    					
    				case 10:
    					System.out.println("Exit");
    					break;
    					
    				default:
    						System.out.println("Invalid choice");
    			}
		}
		while(choice != 10);
	}
}

