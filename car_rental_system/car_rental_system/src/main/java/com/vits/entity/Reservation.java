package com.vits.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Reservation {

    public Reservation(Long id, Car car, Customer customer, LocalDate reservationDate, boolean active) {
		super();
		this.id = id;
		this.car = car;
		this.customer = customer;
		this.reservationDate = reservationDate;
		this.active = active;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", car=" + car + ", customer=" + customer + ", reservationDate="
				+ reservationDate + ", active=" + active + "]";
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
	public LocalDate getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Reservation() {
		
	}
	private LocalDate reservationDate;
    private boolean active;

    // Constructors, getters, setters, and other fields as needed

    // Constructors, getters, setters, and other methods can be added here
}
