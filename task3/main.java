package task3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       EmpImplementation EmpDao = new EmpImplementation(); 
		
		System.out.println("Employee's List");
		for(Employee employee : EmpDao.getAllEmployee()) {
			
					System.out.println("Name : " + employee.getEmployeeName() + "   Id : " + employee.getEmployeeId() );
		}
		
		Employee employee = EmpDao.getAllEmployee().get(1);
		employee.setEmployeeName("Naman");
		EmpDao.updateEmployee(employee);
		
		EmpDao.getEmployee(1);
		for(Employee employee1 : EmpDao.getAllEmployee()) {
			System.out.println("Name : " + employee1.getEmployeeName() + "   Id : " + employee1.getEmployeeId() );
}
		
		Employee employee3 = EmpDao.getAllEmployee().get(2);
		EmpDao.deleteEmployee(employee3);
	    EmpDao.getEmployee(2);
	    for(Employee employee4 : EmpDao.getAllEmployee()) {
			System.out.println("Name : " + employee4.getEmployeeName() + "   Id : " + employee4.getEmployeeId() );
}
	}

}
