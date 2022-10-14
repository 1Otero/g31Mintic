package com.g31.jpa.service;

import com.g31.jpa.entity.Category;
import com.g31.jpa.entity.Game;
import com.g31.jpa.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author desarrollo
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> getCategory(){
        return categoryRepository.findAll();
    }
    
    public Category getCategoryById(Long idCat){
        return categoryRepository.findById(idCat).get();
    }
    
    public Category saveCategory(Category category){
        return categoryRepository.save(category);
    }
}
