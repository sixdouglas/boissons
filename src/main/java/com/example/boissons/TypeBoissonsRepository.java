package com.example.boissons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

@RepositoryRestResource(path="typesBoissons")
@PreAuthorize("hasRole('ROLE_USER')")
public interface TypeBoissonsRepository extends JpaRepository<TypeBoisson, Integer> {

    /* CrudRepository methods */
    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    <S extends TypeBoisson> S save(S s);

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void deleteById(Integer var1);

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void delete(TypeBoisson var1);

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void deleteAll(Iterable<? extends TypeBoisson> var1);

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void deleteAll();

    /* JpaRepository */
    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    <S extends TypeBoisson> List<S> saveAll(Iterable<S> var1);

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    <S extends TypeBoisson> S saveAndFlush(S var1);

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void deleteInBatch(Iterable<TypeBoisson> var1);

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void deleteAllInBatch();
}
