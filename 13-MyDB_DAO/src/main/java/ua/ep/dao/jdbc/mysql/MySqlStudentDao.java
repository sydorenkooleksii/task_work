package ua.ep.dao.jdbc.mysql;

import ua.ep.dao.StudentDao;
import ua.ep.entities.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleksii_Sydorenko on 10/4/2016.
 */
public class MySqlStudentDao implements StudentDao {

    private static final String SELECT_ALL_GOODS = "SELECT * FROM student";
    private static final String SELECT_STUDENT_BY_ID = "SELECT * FROM student WHERE id_Student = ?";
    private static final String SELECT_STUDENT_BY_NAME = "SELECT * FROM student WHERE first_name Like ?";
    private static final String INSERT = "INSERT student (first_name,last_name,date_of_start) VALUES(?,?,?)";
    private static final String DELETE = "delete from student  where id_Student=?";
    private static final String UPDATE = "update student set first_name=?,last_name=?,date_of_start=? where id_Student=?";

    @Override
    public Student find(int id) {

        Student student = new Student();
        Connection connection = MySqlJdbcDaoFactory.getConnection();
        try (PreparedStatement query = connection
                .prepareStatement(SELECT_STUDENT_BY_ID)) {
            query.setInt(1, id);
            ResultSet rs = query.executeQuery();
            rs.next();
            student = getStudentFromResultSet(rs);

        } catch (Exception ex) {
            //log
            throw new RuntimeException(ex);
        }
        return student;
    }

    @Override
    public List<Student> findAll() {
        List<Student> result = new ArrayList<>();
        Connection connection = MySqlJdbcDaoFactory.getConnection();
        try (Statement query = connection.createStatement()) {

            ResultSet rs = query.executeQuery(SELECT_ALL_GOODS);
            while (rs.next()) {
                result.add(getStudentFromResultSet(rs));
            }
        } catch (Exception ex) {
            //log
            throw new RuntimeException(ex);
        }
        return result;
    }

    private Student getStudentFromResultSet(ResultSet resultSet)
            throws SQLException {
        Student student = new Student();
        student.setIdStudent(resultSet.getInt("id_Student"));
        student.setFirstName(resultSet.getString("first_name"));
        student.setLastName(resultSet.getString("last_name"));
        student.setDateOfStart(resultSet.getString("date_of_start"));
        return student;
    }

    @Override
    public void update(Student entity) {

        Connection connection = MySqlJdbcDaoFactory.getConnection();
        try (PreparedStatement query = connection
                .prepareStatement(UPDATE)) {


            query.setString(1, entity.getFirstName());
            query.setString(2, entity.getLastName());
            query.setString(3, entity.getDateOfStart());
            query.setInt(4, entity.getIdStudent());
            query.executeUpdate();

        } catch (Exception ex) {
            //log
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void delete(int id) {

        Connection connection = MySqlJdbcDaoFactory.getConnection();
        try (PreparedStatement query = connection
                .prepareStatement(DELETE)) {
            query.setInt(1, id);
            query.executeUpdate();

        } catch (Exception ex) {
            //log
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void insert(Student entity) {

        Connection connection = MySqlJdbcDaoFactory.getConnection();
        try (PreparedStatement query = connection
                .prepareStatement(INSERT)) {
            query.setString(1, entity.getFirstName());
            query.setString(2, entity.getLastName());
            query.setString(3, entity.getDateOfStart());
            query.executeUpdate();

        } catch (Exception ex) {
            //log
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Student findByName(String name) {

        Student student = new Student();
        Connection connection = MySqlJdbcDaoFactory.getConnection();
        try (PreparedStatement query = connection
                .prepareStatement(SELECT_STUDENT_BY_NAME)) {
            query.setString(1, name);
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                student = getStudentFromResultSet(rs);
            }
        } catch (Exception ex) {
            //log
            throw new RuntimeException(ex);
        }
        return student;
    }
}
