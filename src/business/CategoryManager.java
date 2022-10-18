package business;
import dataAccess.IBaseCategoryDao;
import entities.Category;

import java.util.Objects;

import core.logging.ILoggers;
import java.util.ArrayList;
import java.util.List;
public class CategoryManager {
    private final IBaseCategoryDao iBaseCategoryDao;
    private final ILoggers[] loggers;
    private static final List<Category> categoryList = new ArrayList<>();//aynı kategori ve kursu kullanmayı engellemek için liste yarattık null vermemesi için static koyulabilir.
    public CategoryManager(IBaseCategoryDao iBaseCategoryDao, ILoggers[] loggers) {
        this.iBaseCategoryDao = iBaseCategoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        if(category.getName().trim().isEmpty()) { // if the string is empty it will throw exception
            // trim();-> trims the spaces at the beginning and end of a string, isEmpty();-> checks if the given string is empty or not and
            //returns boolean type true-> when it's empty false-> when it isn't.
            throw new Exception("Category name can not be empty.");

        }

        if(category.getId()<0) {

            throw new Exception("Category Id number cannot be lower than zero");

        }


        for(Category category1: categoryList) {

            if(Objects.equals(category.getName(),category1.getName())) {
                throw new Exception("You cannot enter the same Category name more than one");
            }
            // Object.equals is used to determine whether category and catgory1 are the same or not.

        }
        categoryList.add(category);
        iBaseCategoryDao.add(category);
        for(ILoggers logger: loggers) {
            logger.log(category.getName());
        }
    }

}
