package com.museum.mkbackend.services;

import com.museum.mkbackend.model.Drink;
import com.museum.mkbackend.repos.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {

    private final DrinkRepository drinkRepository;

    @Autowired
    public DrinkService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }


    public Drink addDrink(Drink drink) {
        return drinkRepository.save(drink);
    }

    public List<Drink> findAllDrinks(){
        return drinkRepository.findAll();
    }
}
