package ua.ep;

import ua.ep.dao.DaoFactory;
import ua.ep.dao.StudentDao;
import ua.ep.entities.Student;
import ua.ep.utilities.Database;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {


//        Database database = new Database();
//        database.getTableCourse();
//        database.getTableFault();
//        database.getTablePractice();
//        database.getTablePresence();
//        database.getTableResult();
//        database.getTableStudent();
//        database.getTableTeacher();
//
//
//        System.out.println(database.toString());


        DaoFactory factory = DaoFactory.getInstance();
        StudentDao dao = factory.createStudentDao();
        System.out.println(dao.find(2));
        System.out.println(dao.findByName("Олексій"));
        Student student = new Student();
//        dao.delete(11);
//      dao.insert(student,"Олексій","Олексій","2009-04-8");
        // write your code here
    }
}
