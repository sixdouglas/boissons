package com.example.boissons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource(path="boissons")
public interface BoissonRepository extends JpaRepository<Boisson, Integer> {
    Set<Boisson> findBoissonByNameIsStartingWith(String name);
}
