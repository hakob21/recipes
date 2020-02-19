package com.hakob.recipesapp.repositories;

import com.hakob.recipesapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
