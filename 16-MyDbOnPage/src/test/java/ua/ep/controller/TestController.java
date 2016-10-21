package ua.ep.controller;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ua.ep.entities.Student;
import ua.ep.services.StudentsService;

import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;


public class TestController {
	private OldController controller;
	private StudentsService service;
	
	
	@Before
	public void init(){
		service = mock( StudentsService.class);
		controller = new OldController();
		controller.service = service;
	}
	
	
	@Test
	public void testControllerSameFirstName(){
		when(service.getStudentsWithSameFirstNameAndLastName("Mike")).thenReturn(
				Arrays.asList(new Student()));
		List<Student> actual = controller.doStudentsWithSameFirstNameAndLastName("Mike");
		verify(service).getStudentsWithSameFirstNameAndLastName("Mike");
		//assertEquals
	}
	
	
	
	@Test(expected = RuntimeException.class)
	public void testControllerInvalidDataSameFirstName(){
		String nullString = null;
		controller.doStudentsWithSameFirstNameAndLastName(nullString);
		verify(service).getStudentsWithSameFirstNameAndLastName("Mike");
	}

	@Test
	public void testControllerAnotherLastName(){
		controller.doStudentAnotherLastNameAfterWedding("10","After Wedding");
		verify(service).setStudentAnotherLastNameAfterWedding(10,"After Wedding");
	}
	@Test(expected = RuntimeException.class)
	public void testControllerInvalidDataAnotherLastName(){
		controller.doStudentAnotherLastNameAfterWedding("aaa","After Wedding");
		//verify(service).setStudentAnotherLastNameAfterWedding(10,"After Wedding");
	}
	

	@Test
	public void testControllerInvalidDataAnotherLastNameExt(){
		try{
			controller.doStudentAnotherLastNameAfterWedding("-10","After Wedding");
		}catch(RuntimeException ex){
			
		}
		verify(service , never()).setStudentAnotherLastNameAfterWedding(anyInt(),anyString());
		
	}
	
	
	
	

}
