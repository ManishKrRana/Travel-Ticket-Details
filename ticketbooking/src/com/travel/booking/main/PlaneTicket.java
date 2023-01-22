package com.travel.booking.main;

public class PlaneTicket extends TravelTicket{
	private String planeId;
	private String planeName;
	
	
	public PlaneTicket() {
		super();
	}
	
	
	public PlaneTicket(long bookingRef, String date, String source, String destination, String arrivalTime,
			String departureTime, int price, int seatNo, String planeId, String planeName) {
		super(bookingRef, date, source, destination, arrivalTime, departureTime, price, seatNo);
		this.planeId = planeId;
		this.planeName = planeName;
	}
	
	public String getPlaneId() {
		return planeId;
	}
	public void setPlaneId(String planeId) {
		this.planeId = planeId;
	}
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	
	public void cancel() {
		System.out.println("Your Ticket got canceled");
	}
	
	public void PlaneTicketDetails() {
		System.out.println("Plane Id : "+getPlaneId());
		System.out.println("Plane Name : "+getPlaneName());
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
