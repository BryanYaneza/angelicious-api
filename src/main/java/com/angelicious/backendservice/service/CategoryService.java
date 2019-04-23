package com.angelicious.backendservice.service;

import com.angelicious.backendservice.dao.CategoryDao;
import com.angelicious.backendservice.dao.CategoryDaoService;
import com.angelicious.backendservice.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryService implements CategoryDaoService {

    private final CategoryDao categoryDao;

    @Autowired
    CategoryService(@Qualifier("CategoryDao") CategoryDao categoryDao){
        this.categoryDao = categoryDao;
    }

    @Override
    public Category insertCategory(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public List<Category> selectAllCategory() {
       return categoryDao.findAll();
    }

    @Override
    public Optional<Category> selectCategoryById(UUID categoryID) {
        return categoryDao.findById(categoryID);
    }

    @Override
    public void deleteCategoryById(UUID id) {
         categoryDao.deleteById(id);
    }

    @Override
    public Category updateCategoryById(UUID id, Category category) {
            return categoryDao.save(new Category(id,category.getName(),category.getDescription()));
    }
}
