package task1;
import java.util.ArrayList;
import java.util.List;
public class Service {
	List<Student>studentList=new ArrayList<>();
	public Service() {
		addDefaultData();
	}
	public void addDefaultData() {
		Student st=new Student();
		st.setStudentName1("Arpita");
		st.setStudentGrade("A");
		st.setStudentSection("X");
		addStudent(st);
	}
	public List<Student>getAllData(){
		return studentList;
	}
	public void addStudent(Student student) {
		if(student!=null) {
			studentList.add(student);
		}
	}
	public void update(String studentName,String studentSection) {
		for(Student student:studentList) {
			if(student.getStudentName1().equals(studentName)) {
				student.setStudentSection(studentSection);
				break;
			}
		}
	}
	public List<Student>searchByName(String studentName){
		List<Student>studentListByName=new ArrayList<>();
		for(Student student:studentList) {
			if(student.getStudentName1().equals(studentName)) {
				studentListByName.add(student);
			}
		}
		if(studentListByName.isEmpty()) {
			
		}
		return studentListByName;
	}
	public void deleteStudent(String studentSection) {
		for(Student student:studentList) {
			if(student.getStudentSection().equals(studentSection)) {
				studentList.remove(student);
//				return "student details deleted";
				break;
			}
		}
//		return "student in section"+studentSection+"does not exist";
	}
	

}