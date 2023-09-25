package com.vits.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vits.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    // You can add custom queries here if needed
}

