package com.museum.mkbackend.controller;

import com.museum.mkbackend.model.Drink;
import com.museum.mkbackend.services.DrinkService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("api/drinks")
public class DrinksController {
    private final DrinkService drinkService;

    public DrinksController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping
    public ResponseEntity<List<Drink>>getDrinks(){
        List<Drink> drinks = drinkService.findAllDrinks();
        return new ResponseEntity<>(drinks, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Drink> addDrink(@RequestBody Drink drink){
        Drink newDrink = drinkService.addDrink(drink);
        return new ResponseEntity<>(newDrink,HttpStatus.CREATED);
    }

}
