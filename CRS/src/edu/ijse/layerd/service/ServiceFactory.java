package edu.ijse.layerd.service;

import edu.ijse.layerd.service.custom.impl.CourseDetailsServiceImpl;
import edu.ijse.layerd.service.custom.impl.StudentDetailsServiceImpl;
import edu.ijse.layerd.service.custom.impl.FacultyDetailsServiceImpl;
import edu.ijse.layerd.service.custom.impl.ReportDetailsServiceImpl;
//import edu.ijse.layerd.service.custom.impl.StudentProgressServiceImpl;

public class ServiceFactory {
    private static volatile ServiceFactory serviceFactory;

    private ServiceFactory() {}

    // Thread-safe Singleton
    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            synchronized (ServiceFactory.class) {
                if (serviceFactory == null) {
                    serviceFactory = new ServiceFactory();
                }
            }
        }
        return serviceFactory;
    }

    // Service Getter method
    public SuperService getService(ServiceType type) {
        switch (type) {
            case CourseDetails:
                return new CourseDetailsServiceImpl();
            case StudentDetails:
                return new StudentDetailsServiceImpl();
            case FacultyDetails:
                return new FacultyDetailsServiceImpl();
           case ReportDetails:
                return new ReportDetailsServiceImpl();
            default:
                throw new IllegalArgumentException("Invalid Service Type: " + type);
        }
    }

    // Enum for Service Types
    public enum ServiceType {
        CourseDetails, StudentDetails, FacultyDetails,ReportDetails// ✅ Add StudentProgress here
    }
}
