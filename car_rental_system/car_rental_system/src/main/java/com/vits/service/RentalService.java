package com.vits.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vits.entity.Rental;
import com.vits.repository.RentalRepository;

@Service
public class RentalService {

    @Autowired
    private RentalRepository rentalRepository;

    public List<Rental> getAllRentals() {
        return rentalRepository.findAll();
    }

    public Rental getRentalById(Long id) {
        Optional<Rental> rental = rentalRepository.findById(id);
        return rental.orElse(null);
    }

    public Rental createRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    public Rental updateRental(Long id, Rental updatedRental) {
        Optional<Rental> existingRental = rentalRepository.findById(id);
        if (existingRental.isPresent()) {
            updatedRental.setId(id);
            return rentalRepository.save(updatedRental);
        } else {
            return null;
        }
    }

    public boolean deleteRental(Long id) {
        Optional<Rental> rental = rentalRepository.findById(id);
        if (rental.isPresent()) {
            rentalRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}

