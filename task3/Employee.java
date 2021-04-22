package task3;

public class Employee {
	public String employeeName;
	public int employeeId;
	
	Employee(String employeeName, int employeeId){
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setemployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}
