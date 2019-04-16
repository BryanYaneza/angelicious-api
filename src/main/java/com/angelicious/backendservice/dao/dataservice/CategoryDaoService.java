package com.angelicious.backendservice.dao.dataservice;

import com.angelicious.backendservice.dao.interfaces.CategoryDao;
import com.angelicious.backendservice.model.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("CategoryDao")
public class CategoryDaoService implements CategoryDao {

    @Override
    public int insertCategory(UUID uuid, Category category) {
        return 0;
    }

    @Override
    public List<Category> getAllCategory() {
        return null;
    }

    @Override
    public int deleteCategory(UUID id) {
        return 0;
    }

    @Override
    public int updateCategory(UUID id, Category person) {
        return 0;
    }
}
