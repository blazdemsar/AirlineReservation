package com.blazdemsar.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Reservation {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long ticketId;
	
	@OneToOne
	private Passenger passenger;
	
	@ManyToOne
	@JoinColumn(name="flightId")
	private Flight flight;
	
	private Boolean checkedIn;
	
	private int nrOfBags;
	
	private double ticketFare;
	
	private String username;
	
	public Reservation () {
		super();
	}

	public Reservation(Long ticketId, Passenger passenger, Flight flight, Boolean checkedIn, int nrOfBags,
			double ticketFare, String username) {
		super();
		this.ticketId = ticketId;
		this.passenger = passenger;
		this.flight = flight;
		this.checkedIn = checkedIn;
		this.nrOfBags = nrOfBags;
		this.ticketFare = ticketFare;
	}

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Boolean getCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNrOfBags() {
		return nrOfBags;
	}

	public void setNrOfBags(int nrOfBags) {
		this.nrOfBags = nrOfBags;
	}

	public double getTicketFare() {
		return ticketFare;
	}

	public void setTicketFare(double ticketFare) {
		this.ticketFare = ticketFare;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
