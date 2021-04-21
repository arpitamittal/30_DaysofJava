package task1;
public class Main {

	
	public static void main(String[] args) {
		
      Service ser=new Service();
      
      Student s=new Student();
      s.setStudentName1("Kapish");
      s.setStudentSection("Y");
      ser.addStudent(s);

      
      for(Student datum: ser.getAllData()) {
   	   System.out.println(datum.getStudentSection()+" "+datum.getStudentName1());
      }  
      
      for(Student datum: ser.searchByName("Kapish")) {
      	   System.out.println("\n"+datum.getStudentSection()+" "+datum.getStudentName1());
        }
      
      ser.deleteStudent("Y");
      
      for(Student datum: ser.getAllData()) {
   	   System.out.println("\n"+datum.getStudentSection()+" "+datum.getStudentName1());
      }  
      
      ser.update("Arpita", "Z");
      for(Student datum: ser.getAllData()) {
   	   System.out.println("\n"+datum.getStudentSection()+" "+datum.getStudentName1());
      } 
}


       
}

