package miniproject;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
	static Scanner sc=new Scanner(System.in);
	
	ArrayList<Bank> bankList=new ArrayList<Bank>();

	BankApp()
	{
		
		bankList.add(new Bank(201,"Raman","Delhi",50000,9876453));
		bankList.add(new Bank(202,"Praveg","Dhule",30000,9776453));
		bankList.add(new Bank(203,"Vikas","Pune",40000,7676453));
	}
	public void viewAllEmployeeInfo()
	{   		
		System.out.println("==================================================================================================");

		if(bankList.size()==0)
		{
			System.out.println("No record found!!");
		}
		
		
		for(Bank b:bankList)
		{
			
				System.out.println("Employee Name:"+b.getEmployeeName()+"\t Salary:"+b.getEmployeeSalary()+ "\t Address:"+b.getEmployeeAddress()+"\t Contact:"+b.getEmployeeContact());
			
		}
		System.out.println("==================================================================================================");

	
	}
	public void addEmployeeInfo() 
	{
		System.out.println("Enter Employee Id: ");
		int empId=sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String employeeName=sc.next();
		System.out.println("Enter Employee Address: ");
		String employeeAddress=sc.next();
		System.out.println("Enter Employee Salary: ");
		int employeeSalary=sc.nextInt();
		System.out.println("Enter Employee Contact: ");
		long employeeContact=sc.nextLong();
		
		Bank b=new Bank(empId, employeeName, employeeAddress , employeeSalary, employeeContact);
		
		bankList.add(b);
	}
	public void viewEmployeeInfoById() 
	{
		System.out.println("Enter Employee id:");
		int empId=sc.nextInt();
	    int flag=0;
		System.out.println("==================================================================================================");

		for(Bank b:bankList)
		{
			if(empId==b.getEmpId())
			{   flag=1;
				System.out.println("Employee Name:"+b.getEmployeeName()+"\t "
						+ "Salary:"+b.getEmployeeSalary()+"\t "
								+ "Address:"+b.getEmployeeAddress()+
								"\t Contact:"+b.getEmployeeContact());
			}
		}
		
		if(flag==0)
			System.out.println("Employee Id does not exist!!");
		System.out.println("==================================================================================================");
	
	}
	
	public void updateEmployeetById()
	{
		System.out.println("Enter Employee id:");
		int empId=sc.nextInt();
	    int flag=0,index = 0;
	    Bank  b=null;
	    for(Bank bank:bankList)//101
	    {
	    	if(bank.getEmpId()==empId)//101==101
	    	{
	    		flag=1;
	    		index=bankList.indexOf(bank);//101
	    		System.out.println(index);
	    		b=bank;
	    		break;
	    	}
	    }
	
	 if(flag==1)
	    {
		 
			System.out.println("Enter Employee Name: ");
			String employeeName=sc.next();
			System.out.println("Enter Employee Address: ");
			String employeeAddress=sc.next();
			System.out.println("Enter Employee Salary: ");
			int employeeSalary=sc.nextInt();
			System.out.println("Enter Employee Contact: ");
			long employeeContact=sc.nextLong();
			
			b.setEmployeeName(employeeName);
			b.setEmployeeAddress(employeeAddress);
			b.setEmployeeSalary(employeeSalary);
			b.setEmployeeContact(employeeContact);
			
			bankList.set(index,b);
			System.out.println("==================================================================================================");

			System.out.println("Employee Details updated!!");
	    }
	    else
	    {
	    	System.out.println("Id does not exist!!");
	    }
		System.out.println("==================================================================================================");

	}
	public void deleteAllEmployeeInfo()
	{
		System.out.println("==================================================================================================");

		if(bankList.size()>0)
		{
			bankList.clear();
			System.out.println("All records deleted successfully!!");
		}
		else
		{
			System.out.println("No record available!!");
		}
		System.out.println("==================================================================================================");

	}
	public void deleteEmployeeById() 
	{
		System.out.println("Enter Employee id :");
		int empId=sc.nextInt();//101
		int index=0,flag=0;
		Bank b=null;
		
		for(Bank bank:bankList)
		{
			if(empId==bank.getEmpId())//101
			{
				flag=1;
				index=bankList.indexOf(bank);
				b=bank;
				System.out.println(index);
				break;
			}
		}
		System.out.println("==================================================================================================");

		if(flag==0)
		{
			System.out.println("Employee Id does not exist!!");
		}
		else
		{
			bankList.remove(b);
			System.out.println("Employee record deleted successfully!!");
		}
		
		System.out.println("==================================================================================================");

	}
	
	
	
	
}
