package task3;
import java.util.List;
import java.util.ArrayList;

class EmpImplementation{
	List<Employee> employees;
	public EmpImplementation() {
		employees = new ArrayList<Employee>();
		Employee employee1 = new Employee("Rakesh",0);
		Employee employee2 = new Employee("Nakul",1);
		Employee employee3 = new Employee("Shelav",2);
		Employee employee4 = new Employee("Divyanshu",3);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
	}
	
	public void deleteEmployee(Employee employee) {
		employees.remove(employee.getEmployeeId());
		System.out.println("Id : " + employee.getEmployeeId() + " deleted from database");
	}
	
	public List<Employee> getAllEmployee(){
		return employees;
	}
	
	public Employee getEmployee(int empId) {
		return employees.get(empId);
	}
	
	public void updateEmployee(Employee employee) {
		employees.get(employee.getEmployeeId()).setEmployeeName(employee.getEmployeeName());
		System.out.println("Id : " + employee.getEmployeeId() + " updated in database");
	}
}
