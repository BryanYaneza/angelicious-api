package com.angelicious.backendservice.dao;

import com.angelicious.backendservice.model.Category;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CategoryDaoService {
    Category insertCategory(Category category);
    List<Category> selectAllCategory();
    Optional<Category> selectCategoryById(UUID id);
    void deleteCategoryById(UUID id);
    Category updateCategoryById(UUID id, Category category);
}
