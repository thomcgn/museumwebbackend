package com.museum.mkbackend.repos;

import com.museum.mkbackend.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink,Long> {
}
