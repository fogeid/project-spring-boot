package io.github.fogeid.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.fogeid.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}