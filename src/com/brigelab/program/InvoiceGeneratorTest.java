package com.brigelab.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class InvoiceGeneratorTest {

	@Test
	void givenDistanceAndTime_ShouldReturnTotalFare() {
		InvoiceGenerator invoiceGen = new InvoiceGenerator();
		double distance = 2.0;
		int time = 5 ; 
		double fare = invoiceGen.caculateFare(distance,time);
		assertEquals(25,fare, 0);
		
	}
	
	@Test
	void givenLessDistanceOrTime_ShouldReturnTotalFare() {
		InvoiceGenerator invoiceGen = new InvoiceGenerator();
		double distance = 0.1;
		int time = 1 ; 
		double fare = invoiceGen.caculateFare(distance,time);
		assertEquals(5,fare, 0);
		
	}
	
	@Test
	void given_MultipleRides_ShouldReturn_TotalFare() {
		InvoiceGenerator invoiceGen = new InvoiceGenerator();
		Ride[] rides = { new Ride(2.0, 5),
				 new Ride(0.1, 1)
		};
		double fare = invoiceGen.calculateFare(rides);
		
		assertEquals(30,fare, 0);

	}
	
	@Test
	void given_MultipleRides_ShouldReturn_InvoiceSummary() {
		InvoiceGenerator invoiceGen = new InvoiceGenerator();
		Ride[] rides = { new Ride(2.0, 5),
				 new Ride(0.1, 1)
		};
		InvoiceSummary summary = invoiceGen.calculateFares(rides);
		InvoiceSummary expectedInvoiceSummary  = new InvoiceSummary(2,30 );
		assertEquals(expectedInvoiceSummary, summary);
		
	}

}
