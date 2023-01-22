package com.travel.booking.main;

public class BusTicket extends TravelTicket {
	private String busId;
	private String busName;
	
	
	public BusTicket() {
		super();
	}
	
	
	public BusTicket(long bookingRef, String date, String source, String destination, String arrivalTime,
			String departureTime, int price, int seatNo, String busId, String busName) {
		super(bookingRef, date, source, destination, arrivalTime, departureTime, price, seatNo);
		this.busId = busId;
		this.busName = busName;
	}
	
	
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	
	public void cancel() {
		System.out.println("Your Ticket got canceled!");
	}
	
	public void BusTicketDetails() {
		System.out.println("Bus Id : "+getBusId());
		System.out.println("Bus Name : "+getBusName());
		System.out.println("Booking Reference : "+getBookingRef());
		System.out.println("Date : "+getDate());
		System.out.println("Source : "+getSource());
		System.out.println("Destination : "+getDestination()); 
		System.out.println("Arrival Time : "+getArrivalTime()); 
		System.out.println("Departure Time : "+getDepartureTime()); 
		System.out.println("Seat Number : "+getSeatNo());
		System.out.println("Ticket Price : "+getPrice());
	}

	
}
