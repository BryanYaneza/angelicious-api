package com.angelicious.backendservice.api;

import com.angelicious.backendservice.model.Category;
import com.angelicious.backendservice.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;


@RequestMapping("backend/controller")
@RestController
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(@Qualifier("categoryService") CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public void addCategory(@Valid @NonNull @RequestBody Category category) {
        categoryService.insertCategory(category);
    }

    @GetMapping
    public List<Category> getAllCategory() {
        return categoryService.selectAllCategory();
    }

    @GetMapping(path = "{id}")
    public Category getPersonById(@PathVariable("id") UUID id) {
        return categoryService.selectCategoryById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePersonById(@PathVariable("id") UUID id) {
        categoryService.deleteCategoryById(id);
    }

    @PutMapping(path = "{id}")
    public void updatePerson(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody Category categoryToUpdate) {
        categoryService.updateCategoryById(id, categoryToUpdate);
    }

}
