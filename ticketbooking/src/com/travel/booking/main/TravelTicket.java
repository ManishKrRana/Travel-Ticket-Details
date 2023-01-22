package com.travel.booking.main;

public class TravelTicket {
	private long bookingRef;
	private String date;
    private String source;
    private String destination;
    private String arrivalTime;
    private String departureTime;
    private int price;
    private int seatNo;
	
    
    public TravelTicket() {
		
	}


	public TravelTicket(long bookingRef, String date, String source, String destination, String arrivalTime,
			String departureTime, int price, int seatNo) {
		super();
		this.bookingRef = bookingRef;
		this.date = date;
		this.source = source;
		this.destination = destination;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.price = price;
		this.seatNo = seatNo;
	}


	public long getBookingRef() {
		return bookingRef;
	}


	public void setBookingRef(long bookingRef) {
		this.bookingRef = bookingRef;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	public String getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getSeatNo() {
		return seatNo;
	}


	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
    
    public void cancel() {
    	System.out.println("Your ticket got canceled");
    }
      
      
      
}

