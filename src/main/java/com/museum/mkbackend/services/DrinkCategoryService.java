package com.museum.mkbackend.services;

import com.museum.mkbackend.model.DrinkCategory;
import com.museum.mkbackend.repos.DrinkCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkCategoryService {

    private final DrinkCategoryRepository drinkCategoryRepository;

    @Autowired
    public DrinkCategoryService(DrinkCategoryRepository drinkCategoryRepository){
        this.drinkCategoryRepository = drinkCategoryRepository;
    }

    public List<DrinkCategory> findAllCategories(){
        return drinkCategoryRepository.findAll();
    }

    public DrinkCategory addCategory(DrinkCategory category){
        return drinkCategoryRepository.save(category);
    }
}
