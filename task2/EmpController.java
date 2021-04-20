package task2;

public class EmpController {
	private Emp model;
	   private EmpView view;

	   public EmpController(Emp model, EmpView view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setEmployeeName(String name){
	      model.setEmployeeName(name);		
	   }

	   public String getEmployeeName(){
	      return model.getEmployeeName();		
	   }

	   public void setEmployeeId(int employeeId){
	      model.setEmployeeId(employeeId);		
	   }

	   public int getEmployeeId(){
	      return model.getEmployeeId();		
	   }
	   
	   public void setEmployeeCity(String employeeCity){
		      model.setEmployeeCity(employeeCity);		
		   }

		   public String getEmployeeCity(){
		      return model.getEmployeeCity();		
		   }
	   
	   

	   public void updateView(){				
	      view.printEmployeeDetails(model.getEmployeeName(), model.getEmployeeId(), model.getEmployeeCity());
	   }
  
}
