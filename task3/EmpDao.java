package task3;

import java.util.List;

class interface EmpDao{
	public List<Employee>getAllEmployee();
	public Employee getEmployee(int employeeId);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
}
