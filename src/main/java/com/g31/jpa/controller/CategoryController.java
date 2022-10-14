package com.g31.jpa.controller;

import com.g31.jpa.entity.Category;
import com.g31.jpa.entity.Game;
import com.g31.jpa.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author desaextremo
 */
@RestController
@RequestMapping("/Category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    
    
    @GetMapping("/all")
    public List<Category> getCategory(){
        return categoryService.getCategory();
    }
    
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable("id") Long idCat){
        return categoryService.getCategoryById(idCat);
    }
    @PostMapping("/save")
    public ResponseEntity saveCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
        return ResponseEntity.status(201).build();
    }
}
