package com.evgen.server.repositories;

import com.evgen.server.models.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface TypeRepository extends JpaRepository<Type, Long> {
    Optional<Type> findById(Long id);
}
