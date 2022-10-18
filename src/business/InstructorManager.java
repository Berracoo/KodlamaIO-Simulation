package business;
import dataAccess.IBaseInstructorDao;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

import core.logging.ILoggers;

public class InstructorManager {
    private final IBaseInstructorDao iBaseInstructorDao;
    private final ILoggers[] loggers;
    private final List<Instructor> instructorList = new ArrayList<>();

    public InstructorManager(IBaseInstructorDao iBaseInstructorDao, ILoggers[] logger) {

        this.iBaseInstructorDao = iBaseInstructorDao;
        this.loggers = logger;
    }

    public void add(Instructor instructor) throws Exception {

        if(instructor.getId()<0) {

            throw new Exception("Instructor Id must be positive.");

        }else if(instructor.getFirstName().trim().isEmpty() || instructor.getLastName().trim().isEmpty()) {

            throw new Exception("Instructor's first name and last name must be entered.");
        }

        for (ILoggers logger : loggers) {
            logger.log(instructor.getFirstName()+""+ instructor.getLastName());

        }
        instructorList.add(instructor);
        iBaseInstructorDao.add(instructor);


    }





}
