package com.vits.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @Override
	public String toString() {
		return "Rental [id=" + id + ", car=" + car + ", rentalDateTime=" + rentalDateTime + ", returnDate=" + returnDate
				+ ", rentalFee=" + rentalFee + "]";
	}
	public Rental(Long id, Car car, Customer customer, LocalDateTime rentalDateTime, LocalDate returnDate,
			BigDecimal rentalFee) {
		super();
		this.id = id;
		this.car = car;
		this.customer = customer;
		this.rentalDateTime = rentalDateTime;
		this.returnDate = returnDate;
		this.rentalFee = rentalFee;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public LocalDateTime getRentalDateTime() {
		return rentalDateTime;
	}
	public void setRentalDateTime(LocalDateTime rentalDateTime) {
		this.rentalDateTime = rentalDateTime;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public BigDecimal getRentalFee() {
		return rentalFee;
	}
	public void setRentalFee(BigDecimal rentalFee) {
		this.rentalFee = rentalFee;
	}
	@ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private LocalDateTime rentalDateTime;
    private LocalDate returnDate;
    private BigDecimal rentalFee;

    // Constructors, getters, setters, and other fields as needed

    // Constructors, getters, setters, and other methods can be added here
}

