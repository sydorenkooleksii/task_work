package ua.ep.controller;

import java.util.List;

import ua.ep.entities.Student;
import ua.ep.services.StudentsService;

public class OldController {

	
	
	StudentsService service = StudentsService.getInstance(); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OldController().doStudentsWithSameFirstNameAndLastName("Alex");
		new OldController().doStudentAnotherLastNameAfterWedding("6","Obama");
	}
	public List<Student>  doStudentsWithSameFirstNameAndLastName(String name){
		if ( name==null )
			throw new IllegalArgumentException();
		List<Student> student = service.getStudentsWithSameFirstNameAndLastName(name);
		return student;
	}
	
	public Student  doStudentAnotherLastNameAfterWedding(String idString,String lastName){
		int id = Integer.parseInt(idString);
		if ( lastName==null || id<0)
			throw new IllegalArgumentException();
		Student student = service.setStudentAnotherLastNameAfterWedding( id,lastName);
		return student;
	}
	
}
