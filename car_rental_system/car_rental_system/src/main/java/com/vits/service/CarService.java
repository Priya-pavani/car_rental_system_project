package com.vits.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vits.entity.Car;
import com.vits.repository.CarRepository;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCarById(Long id) {
        Optional<Car> car = carRepository.findById(id);
        return car.orElse(null);
    }

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Long id, Car updatedCar) {
        Optional<Car> existingCar = carRepository.findById(id);
        if (existingCar.isPresent()) {
            updatedCar.setId(id);
            return carRepository.save(updatedCar);
        } else {
            return null;
        }
    }

    public boolean deleteCar(Long id) {
        Optional<Car> car = carRepository.findById(id);
        if (car.isPresent()) {
            carRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}

