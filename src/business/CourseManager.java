package business;
import dataAccess.IBaseCourseDao;

import entities.Course;
import core.logging.ILoggers;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class CourseManager {
    private IBaseCourseDao iBaseCourseDao;
    private ILoggers[] loggers;
    private List<Course> courseList = new ArrayList<>();


    public CourseManager(IBaseCourseDao iBaseCourseDao, ILoggers[] loggers) {
        this.iBaseCourseDao = iBaseCourseDao;
        this.loggers = loggers;

    }

    public void add(Course course) throws Exception {

        if (course.getPrice() < 0) {
            throw new Exception("Course price must be bigger that zero.");
        } else if (course.getId() < 0) {

            throw new Exception("Course Id must be positive.");
        } else if (course.getName().trim().isEmpty()) {

            throw new Exception("Course name must be full.");
        } else if (course.getDescription().trim().isEmpty()) {

            throw new Exception("Course description must be full.");
        }
        for (Course course1 : courseList) {

            if (course.getName() == course1.getName()) {

                throw new Exception("You cannot enter same course twice.");

            }

        }
        courseList.add(course);
        iBaseCourseDao.add(course);

        for (ILoggers logger : loggers) {
            logger.log(course.getName());

        }

    }


}
