package dataAccess.jdbc;

import dataAccess.IBaseInstructorDao;
import entities.Instructor;

public class JdbcInstructorDao implements IBaseInstructorDao {

    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor"+ instructor.getFirstName()+ "" +instructor.getLastName() +"added to the database with Jdbc");
    }
}
