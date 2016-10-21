package ua.ep.services;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import ua.ep.dao.StudentDao;
import ua.ep.entities.Student;

public class StudentsServiceMockitoTest {
	@Test
	public void testStudentListWithSameLastName(){
		StudentsService service = new StudentsService();
		StudentDao dao = mock(StudentDao.class);
		service.setDao(dao);
		
		when(dao.findByName("Mike")).thenReturn(
				Arrays.asList( new Student("Mike","Mike","2008-08-08") , 
						       new Student("Mike","b","2009-04-08")));
		List<Student> actual = service.getStudentsWithSameFirstNameAndLastName("Mike");
		assertEquals( Arrays.asList( new Student("Mike","Mike","2008-08-08"))
				, actual);
		
	}

	@Test
	public void testStudentListAfterWedding(){
		StudentsService service = new StudentsService();
		StudentDao dao = mock(StudentDao.class);
		service.setDao(dao);
		
		when(dao.find(1)).thenReturn(
				 new Student(1,"Mike","Mike","2008-08-08") );
		Student actual = service.setStudentAnotherLastNameAfterWedding(1,"Mike");
		assertEquals( new Student("Mike","Mike/Mike","2008-08-08")
				, actual);
		
	}
	
}
