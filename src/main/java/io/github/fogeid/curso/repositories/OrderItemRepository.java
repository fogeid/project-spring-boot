package io.github.fogeid.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.fogeid.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}