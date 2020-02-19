package com.hakob.recipesapp.repositories;

import com.hakob.recipesapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
