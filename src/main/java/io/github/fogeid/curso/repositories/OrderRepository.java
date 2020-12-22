package io.github.fogeid.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.fogeid.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}