package ua.ep.dao;

import ua.ep.entities.Student;

import java.util.List;

/**
 * Created by Oleksii_Sydorenko on 10/4/2016.
 */
public interface StudentDao extends GenericDao<Student> {

	List<Student> findByName (String name);
}
