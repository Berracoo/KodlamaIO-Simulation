package dataAccess.hibernate;

import dataAccess.IBaseCourseDao;
import entities.Course;

public class HibernateCourseDao implements IBaseCourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Course: "+ course.getName() +"added to the database with Hibernate");
    }
}
