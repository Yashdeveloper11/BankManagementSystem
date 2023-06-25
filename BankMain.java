package miniproject;

import java.util.Scanner;

public class BankMain {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("====================================================================");
		System.out.println("============= Bank Management System =============================");
		System.out.println("====================================================================");
		String ch;
		BankApp app=new BankApp();
		do
		{
		
		System.out.println("\t\t 1)View employee Information\r\n"
				+ "\t\t 2)Insert employee info by employee id.\r\n"
				+ "\t\t 3)view all employee information By Id.\r\n"
				+ "\t\t 4)Update employee information by id.\r\n"
				+ "\t\t 5)delete employee information by id.\r\n"
				+ "\t\t 6)delete all employee information.");
		System.out.println("====================================================================");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		
		case 1:	app.viewAllEmployeeInfo();
				break;
		case 2:	app.addEmployeeInfo();
		break;
		case 3:	app.viewEmployeeInfoById();
		break;
		case 4:	app.updateEmployeetById();
		break;
		case 5:	app.deleteEmployeeById();
		break;
		case 6:	app.deleteAllEmployeeInfo();
		break;
	    default:System.out.println("Wrong choice!!"); 		   
		
	    
	    
		}
		
		System.out.println("Do you want to continue? (Y-Yes / N-No)");
		 ch=sc.next();
		}
		while(ch.equals("Y")||ch.equals("y"));
		System.out.println("====================================================================");

		System.out.println("Bye....");
	
		System.out.println("====================================================================");


	}

}
