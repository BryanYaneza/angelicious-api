package com.angelicious.backendservice.dao;
import com.angelicious.backendservice.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository("CategoryDao")
public interface CategoryDao extends JpaRepository<Category, UUID> {

//    @Query("select s from Article s where s.author like ?1 and s.title = ?2")
//    List<Article> findByAuthorAndTitle(String author, String title);
}
