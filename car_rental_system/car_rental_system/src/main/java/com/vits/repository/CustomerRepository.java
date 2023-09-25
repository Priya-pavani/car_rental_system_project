package com.vits.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vits.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // You can add custom queries here if needed
}
