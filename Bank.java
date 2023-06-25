package miniproject;

public class Bank {
	
private int empId;
private String employeeName;
private String employeeAddress;
private int employeeSalary;
private long employeeContact;




public Bank() {
	super();
}


public Bank(int empId, String employeeName, String employeeAddress, int employeeSalary, long employeeContact) {
	super();
	this.empId = empId;
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
	this.employeeSalary = employeeSalary;
	this.employeeContact = employeeContact;
}


public int getEmpId() {
	return empId;
}


public void setEmpId(int empId) {
	this.empId = empId;
}


public String getEmployeeName() {
	return employeeName;
}


public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}


public String getEmployeeAddress() {
	return employeeAddress;
}


public void setEmployeeAddress(String employeeAddress) {
	this.employeeAddress = employeeAddress;
}


public int getEmployeeSalary() {
	return employeeSalary;
}


public void setEmployeeSalary(int employeeSalary) {
	this.employeeSalary = employeeSalary;
}


public long getEmployeeContact() {
	return employeeContact;
}


public void setEmployeeContact(long employeeContact) {
	this.employeeContact = employeeContact;
}







}
