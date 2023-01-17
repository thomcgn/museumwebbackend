package com.museum.mkbackend.repos;

import com.museum.mkbackend.model.DrinkCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkCategoryRepository extends JpaRepository<DrinkCategory,Long> {
}
