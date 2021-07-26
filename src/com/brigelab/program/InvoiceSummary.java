package com.brigelab.program;

public class InvoiceSummary {

	private int numberOfRides;
	private double totalFare;
	private double averageFare;

	public InvoiceSummary(int numberOfRides, double totalFare2) {
		this.numberOfRides = numberOfRides;
		this.totalFare = totalFare2;
		this.averageFare = this.totalFare/this.numberOfRides; 
		
	}

	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        InvoiceSummary that = (InvoiceSummary) o;
	        return numberOfRides == that.numberOfRides &&
	               Double.compare(that.totalFare, totalFare) == 0 &&
	               Double.compare(that.averageFare, averageFare) == 0;
	    }

}
