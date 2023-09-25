package com.vits.entity;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
public class Car {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String make;
	    private String model;
	    private int year;
	    private String registrationNumber;
	    private BigDecimal dailyRentalRate;
	    private int seat_count;
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getRegistrationNumber() {
			return registrationNumber;
		}

		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}

		public BigDecimal getDailyRentalRate() {
			return dailyRentalRate;
		}

		public void setDailyRentalRate(BigDecimal dailyRentalRate) {
			this.dailyRentalRate = dailyRentalRate;
		}

		public int getSeat_count() {
			return seat_count;
		}

		public void setSeat_count(int seat_count) {
			this.seat_count = seat_count;
		}

		public boolean isAvailable() {
			return available;
		}

		public void setAvailable(boolean available) {
			this.available = available;
		}

		public Set<Rental> getRentals() {
			return rentals;
		}

		public void setRentals(Set<Rental> rentals) {
			this.rentals = rentals;
		}

		private boolean available;

	    public Car() {
			
		}

		public Car(Long id, String make, String model, int year, String registrationNumber, BigDecimal dailyRentalRate,
				int seat_count, boolean available, Set<Rental> rentals) {
			super();
			this.id = id;
			this.make = make;
			this.model = model;
			this.year = year;
			this.registrationNumber = registrationNumber;
			this.dailyRentalRate = dailyRentalRate;
			this.seat_count = seat_count;
			this.available = available;
			this.rentals = rentals;
		}

		@OneToMany(mappedBy = "car")
	    private Set<Rental> rentals;

	    // Constructors, getters, setters, and other fields as needed

	    // Constructors, getters, setters, and other methods can be added here
	}

