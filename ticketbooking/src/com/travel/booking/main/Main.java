package com.travel.booking.main;

public class Main {

	public static void main(String[] args) {
		System.out.println("  Train Ticket Details are:- \n");
		TrainTicket ticketDetails1 = new TrainTicket(123L, "23/03/2023", "Ranchi", "Delhi", "02:00 AM", "05:00 PM", 1200, 345, "025AB", "Super Express", 1, 30);
        ticketDetails1.TrainTicketDetails();
		
		System.out.println("\n");
		
		
		System.out.println("  Plane Ticket Details are:- \n");
		PlaneTicket ticketDetails2 = new PlaneTicket(002, "28/03/2023", "Ranchi", "Banglore", "02:00 PM", "05:00 PM", 12000, 546, "A025", "INDIGO");
        ticketDetails2.PlaneTicketDetails();
		
		System.out.println("\n");
		
		System.out.println("  Bus Ticket Details are:- \n");
		BusTicket ticketDetails3 = new BusTicket(205, "25/03/2023", "Ranchi", "Hazaribagh", "03:00 PM", "05:00 PM", 200, 5, "65BA", "PAMMI");
        ticketDetails3.BusTicketDetails();
		
		System.out.println("\n");
		
	}
	
	    

}
