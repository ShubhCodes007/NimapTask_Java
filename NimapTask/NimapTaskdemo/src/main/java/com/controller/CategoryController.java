package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Category;
import com.repository.CategoryRepository;

@RestController
@RequestMapping("/api/categories")
public class CategoryController 
{

 @Autowired
 private CategoryRepository categoryRepository;

 @GetMapping
 public Page<Category> getAllCategories(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) 
 {
     return categoryRepository.findAll(PageRequest.of(page, size));
 }
 
 

 @PostMapping
 public Category createCategory(@RequestBody Category category) 
 {
     return categoryRepository.save(category);
 }

 @GetMapping("/{id}")
 public Category getCategoryById(@PathVariable Long id) 
 {
     return categoryRepository.findById(id).orElseThrow();
 }

 @PutMapping("/{id}")
 public Category updateCategory(@PathVariable Long id, @RequestBody Category categoryDetails) 
 {
     Category category = categoryRepository.findById(id).orElseThrow();
     category.setName(categoryDetails.getName());
     return categoryRepository.save(category);
 }
 @DeleteMapping("/{id}")
 public ResponseEntity<?> deleteCategory(@PathVariable Long id)
 {
     Category category = categoryRepository.findById(id).orElseThrow();
     categoryRepository.delete(category);
     return ResponseEntity.ok().build();
 }
}
