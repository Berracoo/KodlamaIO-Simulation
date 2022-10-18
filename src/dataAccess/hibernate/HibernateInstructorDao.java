package dataAccess.hibernate;

import dataAccess.IBaseInstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements IBaseInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor:"+ instructor.getFirstName()+ "" +instructor.getLastName() +"added to the database with Hibernate");
    }
}
