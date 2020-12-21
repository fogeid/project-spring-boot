package io.github.fogeid.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.fogeid.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}