package com.travel.booking.main;

public class TrainTicket extends TravelTicket {
	private String trainId;
	private String trainName;
	private int travelClass;
	private int carriageNumber;
	
	
	public TrainTicket() {
		super();
		
	}
	public TrainTicket(long bookingRef, String date, String source, String destination, String arrivalTime,
			String departureTime, int price, int seatNo, String trainId, String trainName, int travelClass, int carriageNumber) {
		super(bookingRef, date, source, destination, arrivalTime, departureTime, price, seatNo);
		this.trainId = trainId;
		this.trainName = trainName;
		this.travelClass = travelClass;
		this.carriageNumber = carriageNumber;
	}
	public String getTrainId() {
		return trainId;
	}
	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public int getTravelClass() {
		return travelClass;
	}
	public void setTravelClass(int travelClass) {
		this.travelClass = travelClass;
	}
	public int getCarriageNumber() {
		return carriageNumber;
	}
	public void setCarriageNumber(int carriageNumber) {
		this.carriageNumber = carriageNumber;
	}
	
	public void cancel() {
		System.out.println("Your Ticket got Canceled");
	}
	
	public void TrainTicketDetails() {
		System.out.println("Train Id : "+getTrainId());
		System.out.println("Train Name : "+getTrainName());
		System.out.println("Booking Reference : "+getBookingRef());
		System.out.println("Date : "+getDate());
		System.out.println("Source : "+getSource());
		System.out.println("Destination : "+getDestination()); 
		System.out.println("Arrival Time : "+getArrivalTime()); 
		System.out.println("Departure Time : "+getDepartureTime()); 
		System.out.println("Seat Number : "+getSeatNo());
		System.out.println("Travel Class : "+getTravelClass()); 
		System.out.println("Carriage Number : "+getCarriageNumber());  
		System.out.println("Ticket Price : "+getPrice());
	}

}
