package com.example.boissons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "typesBoissons")
public interface TypeBoissonsRepository extends JpaRepository<TypeBoisson, Integer> {
}
