package ua.ep.dao.jdbc.mysql;

import ua.ep.dao.*;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.mysql.cj.jdbc.Driver;

/**
 * Created by Oleksii_Sydorenko on 10/4/2016.
 */
public class MySqlJdbcDaoFactory extends DaoFactory {



    private static final String DB_CONFIG_FILE_NAME = "/db.properties";
    private static final String DB_USER = "db.user";
    private static final String DB_PASS = "db.pass";
    private static final String DB_URL = "db.url";
    private static Connection connection ;

    private static final Logger log = Logger.getLogger(MySqlJdbcDaoFactory.class);
    
    static Connection getConnection(){
        try{
            if( connection == null ){
                InputStream in = MySqlJdbcDaoFactory
                        .class.getResourceAsStream(DB_CONFIG_FILE_NAME);
                Properties props = new Properties();
                props.load(in);
                new Driver();
                connection =  DriverManager
                        .getConnection( props.getProperty(DB_URL) ,
                                props.getProperty(DB_USER),
                                props.getProperty(DB_PASS));
            }
            return connection;
        }catch(Exception ex){
            // logging
        	log.error("Something failed in connection", ex);
            throw new RuntimeException( ex );
        }

    }


    @Override
    public CourseDao createCourseDao() {
        return null;
    }

    @Override
    public FaultDao createFaultDao() {
        return null;
    }

    @Override
    public PracticeDao createPracticeDao() {
        return null;
    }

    @Override
    public PresenceDao createPresenceDao() {
        return null;
    }

    @Override
    public ResultDao createResultDao() {
        return null;
    }

    @Override
    public StudentDao createStudentDao() {
        return new MySqlStudentDao();
    }

    @Override
    public TeacherDao createTeacherDao() {
        return null;
    }
}
