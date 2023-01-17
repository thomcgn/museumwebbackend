package com.museum.mkbackend.controller;

import com.museum.mkbackend.model.DrinkCategory;
import com.museum.mkbackend.services.DrinkCategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/drinks/category")
public class DrinkCategoriesController {

    private final DrinkCategoryService categoryService;

    public DrinkCategoriesController(DrinkCategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<DrinkCategory>>getCategories(){
        List<DrinkCategory> categories = categoryService.findAllCategories();
        return  new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<DrinkCategory> addCategorie(@RequestBody DrinkCategory category){
        DrinkCategory newCategory = categoryService.addCategory(category);
        return new ResponseEntity<>(newCategory,HttpStatus.CREATED);
    }
}
