package ua.ep.utilities;

import ua.ep.entities.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleksii_Sydorenko on 9/30/2016.
 */
public class Database {
    List<Course> courseList = new ArrayList<>();
    List<Fault> faultList = new ArrayList<>();
    List<Practice> practiceList = new ArrayList<>();
    List<Presence> presenceList = new ArrayList<>();
    List<Result> resultList = new ArrayList<>();
    List<Student> studentList = new ArrayList<>();
    List<Teacher> teacherList = new ArrayList<>();


    public void getTableCourse() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_courses?useSSL=false", "root", "1234");

        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM course")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Course course = new Course(rs.getInt("id_Course"),
                        rs.getString("category"),
                        rs.getInt("price"),
                        rs.getInt("duration"));
                courseList.add(course);
            }
        }
    }

    public void getTableFault() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_courses?useSSL=false", "root", "1234");

        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM fault")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Fault fault = new Fault(rs.getInt("id_Fault"),
                        rs.getString("fault"),
                        rs.getInt("Practice_id_Pr"));
                faultList.add(fault);
            }
        }
    }

    public void getTablePractice() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_courses?useSSL=false", "root", "1234");

        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM practice")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Practice practice = new Practice(rs.getInt("id_Practice"),
                        rs.getInt("training"),
                        rs.getInt("Student_id_Student"),
                        rs.getInt("Teacher_id_Teacher"),
                        rs.getString("date_of_practice"));
                practiceList.add(practice);
            }
        }
    }

    public void getTablePresence() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_courses?useSSL=false", "root", "1234");

        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM presence")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Presence presence = new Presence(rs.getBoolean("Presence_1"),
                        rs.getInt("Student_id_St"),
                        rs.getInt("id_Presence"),
                        rs.getString("date_of_presence"));
                presenceList.add(presence);
            }
        }
    }

    public void getTableResult() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_courses?useSSL=false", "root", "1234");

        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM result")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Result result = new Result(rs.getInt("id_Result"),
                        rs.getInt("previous"),
                        rs.getInt("final"),
                        rs.getInt("Student_id_Student"),
                        rs.getString("date_of_previous"),
                        rs.getString("date_of_final"));
                resultList.add(result);
            }
        }
    }

    public void getTableStudent() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_courses?useSSL=false", "root", "1234");

        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM student")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Student student = new Student(rs.getInt("id_Student"), rs.getString("first_name"),
                        rs.getString("last_name"), rs.getString("date_of_start"));
                studentList.add(student);
            }
        }
    }

    public void getTableTeacher() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_courses?useSSL=false", "root", "1234");

        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM teacher")) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Teacher teacher = new Teacher(rs.getInt("id_Teacher"), rs.getString("first_name"),
                        rs.getString("last_name"));
                teacherList.add(teacher);
            }
        }
    }

    @Override
    public String toString() {
        return "Database{" +'\n'+
                "courseList=" + courseList +'\n'+
                "faultList=" + faultList +'\n'+
                "practiceList=" + practiceList +'\n'+
                "presenceList=" + presenceList +'\n'+
                "resultList=" + resultList +'\n'+
                "studentList=" + studentList +'\n'+
                "teacherList=" + teacherList +'\n'+
                '}';
    }
}
