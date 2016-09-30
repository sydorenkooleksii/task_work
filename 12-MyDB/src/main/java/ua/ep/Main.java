package ua.ep;

import ua.ep.utilities.Database;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {


        Database database = new Database();
        database.getTableCourse();
        database.getTableFault();
        database.getTablePractice();
        database.getTablePresence();
        database.getTableResult();
        database.getTableStudent();
        database.getTableStudentHasCourse();
        database.getTableTeacher();


        System.out.println(database.toString());

        // write your code here
    }
}
