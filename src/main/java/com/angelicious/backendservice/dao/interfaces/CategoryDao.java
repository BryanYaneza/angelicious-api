package com.angelicious.backendservice.dao.interfaces;
import com.angelicious.backendservice.model.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryDao {
    int insertCategory(UUID uuid, Category category);
    List<Category> getAllCategory();
    int deleteCategory(UUID id);
    int updateCategory(UUID id, Category person);
}
