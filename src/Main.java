import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import dataAccess.jdbc.JdbcCategoryDao;
import dataAccess.jdbc.JdbcInstructorDao;
import entities.*;
import dataAccess.hibernate.*;

public class Main {
    public static void main(String[] args) throws Exception{

        core.logging.ILoggers[] loggers = {new DatabaseLogger(), new FileLogger()};


        Category category = new Category(2,"Front-end");
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
        categoryManager.add(category);
        System.out.println("_______________");

        Course course = new Course(2,"Java Advanced","This course for the people who wants more complex Java Projects.",300);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course);
        System.out.println("_______________");

        Instructor instructor = new Instructor(2,"Engin","Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
        instructorManager.add(instructor);
    }
}