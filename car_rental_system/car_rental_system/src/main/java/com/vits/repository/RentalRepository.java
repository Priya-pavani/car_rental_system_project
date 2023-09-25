package com.vits.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vits.entity.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {
    // You can add custom queries here if needed
}

