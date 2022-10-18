package dataAccess.jdbc;

import dataAccess.IBaseCategoryDao;
import entities.Category;

public class JdbcCategoryDao implements IBaseCategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Category: "+ category.getName() +"added to the database with Jdbc");
    }
}
