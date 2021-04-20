package task2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp model =defaultEmployeeDatabase();
		EmpView view = new EmpView();
		EmpController controller =new EmpController(model, view);
		 
		controller.updateView();

	      controller.setEmployeeName("Rohan");
	      controller.setEmployeeId(90);
	      controller.setEmployeeCity("Bangalore");

	      controller.updateView();
		
	}
	private static Emp defaultEmployeeDatabase() {
		// TODO Auto-generated method stub
		Emp employee =new Emp();
		employee.setEmployeeName("Riya");
		employee.setEmployeeId(45);
		employee.setEmployeeCity("Chandigarh");
		return employee;
	}
	

}
