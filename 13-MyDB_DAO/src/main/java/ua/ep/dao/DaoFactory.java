package ua.ep.dao;

import ua.ep.entities.Fault;

/**
 * Created by Oleksii_Sydorenko on 10/4/2016.
 */
public abstract class DaoFactory {
    public abstract CourseDao createCourseDao ();
    public abstract FaultDao createFaultDao ();
    public abstract PracticeDao createPracticeDao ();
    public abstract PresenceDao createPresenceDao ();
    public abstract ResultDao createResultDao ();
    public abstract StudentDao createStudentDao ();
    public abstract TeacherDao createTeacherDao ();

    public static DaoFactory getInstance(){
        String factoryClassName = "ua.ep.dao.jdbc.mysql.MySqlJdbcDaoFactory";
        try {
            return (DaoFactory) Class.forName(factoryClassName)
                    .newInstance();
        } catch (Exception e) {
            //log
            throw new RuntimeException(e);
        }
    }

}
