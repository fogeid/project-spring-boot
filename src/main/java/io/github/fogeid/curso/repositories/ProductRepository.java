package io.github.fogeid.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.fogeid.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}