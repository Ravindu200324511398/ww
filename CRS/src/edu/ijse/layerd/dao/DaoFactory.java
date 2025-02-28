package edu.ijse.layerd.dao;

import edu.ijse.layerd.dao.custom.CourseDetailsDao;
import edu.ijse.layerd.dao.custom.StudentDetailsDao;
//import edu.ijse.layerd.dao.custom.EnrollmentDAO;
import edu.ijse.layerd.dao.custom.impl.CourseDetailsDaoImpl;
import edu.ijse.layerd.dao.custom.impl.FacultyDetailsDaoImpl;
import edu.ijse.layerd.dao.custom.impl.ReportDetailsDaoImpl;
import edu.ijse.layerd.dao.custom.impl.StudentDetailsDaoImpl;
//import edu.ijse.layerd.dao.custom.impl.EnrollmentDAOImpl;

public class DaoFactory {
    private static volatile DaoFactory daoFactory;

    private DaoFactory() {}

    // Thread-safe Singleton Pattern
    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            synchronized (DaoFactory.class) {
                if (daoFactory == null) {
                    daoFactory = new DaoFactory();
                }
            }
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type) {
        switch (type) {
            case CourseDetails:
                return new CourseDetailsDaoImpl();
            case StudentDetails:
                return new StudentDetailsDaoImpl();
           
            case FacultyDetails:
                return new FacultyDetailsDaoImpl();
             case ReportDetails:
                return new ReportDetailsDaoImpl();    
            default:
                throw new IllegalArgumentException("Invalid DAO Type: " + type);
        }
    }

    // Enum for DAO Types
    public enum DaoTypes {
        StudentDetails, CourseDetails, FacultyDetails,ReportDetails
    }
}
