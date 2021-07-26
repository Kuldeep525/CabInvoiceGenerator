package com.brigelab.program;

public class InvoiceGenerator {
	
	
	private static int COST_PER_TIME = 1;
	 static double MINIMUM_COST_PER_KILOMETER = 10 ;
		double MINIMUM_FARE = 5 ;
	public double caculateFare(double distance, int time) {
	
		
		double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
	
		return Math.max( totalFare,MINIMUM_FARE);                           //this will compare max of both
	}
	public double calculateFare(Ride[] rides) {
		double totalFare=0.0;
		for(Ride ride:rides) {
			totalFare += this.caculateFare(ride.distance,ride.time);
		}
		return totalFare;
	}
	

	public InvoiceSummary calculateFares(Ride[] rides) {
	double totalFare = 0.0 ;
	for(Ride ride : rides) {
		totalFare += this.caculateFare(ride.distance,ride.time);
	}
	return new InvoiceSummary(rides.length, totalFare);
	}
}
