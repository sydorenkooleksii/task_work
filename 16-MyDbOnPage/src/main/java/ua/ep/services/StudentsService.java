package ua.ep.services;

import java.util.ArrayList;
import java.util.List;

import ua.ep.dao.DaoFactory;
import ua.ep.dao.StudentDao;
import ua.ep.entities.Student;

public class StudentsService {
	
	
	private static StudentsService instance;
	
	private StudentDao dao = DaoFactory.getInstance().createStudentDao();
	
	
	StudentsService() {
		super();
	}

	void setDao(StudentDao dao) {
		this.dao = dao;
	}

	public static StudentsService getInstance(){
		if( instance == null ){
			instance = new StudentsService();
		}
		return instance;
	}
	
	public List<Student> getStudentsWithSameFirstNameAndLastName(String name){
		List<Student> list = dao.findByName(name);
		List<Student> result = new ArrayList<Student>();
		for(Student g : list ){
			        if (g!=null) {
			        	if(g.getFirstName().equals(g.getLastName())){
			        		result.add(g);
			        	}		        
			        }
			    }
		return result;
	}
	
	public Student setStudentAnotherLastNameAfterWedding(int id,String lastName){
		Student list = dao.find(id);
			        if (list!=null) {
			        	String temp = list.getLastName();
			        	list.setLastName(temp+"/"+lastName);
			        }
		return list;
	}
		public List<Student> findAll(){
			return dao.findAll();
		}
		public Student find(int id){
			return dao.find(id);
		}
		
	}

