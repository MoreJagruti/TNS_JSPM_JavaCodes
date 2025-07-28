package com.tnsif.interfacen;
import java.math.*;
public class KingFisher implements AirFare{
	double amount;
	int hours;
	double costPerHour;

	public KingFisher() {
	}

	public KingFisher(int hours, double costPerHour) {
		this.hours = hours;
		this.costPerHour = costPerHour;
	}

	@Override
	public double calculateAmount() {
		amount = 4*hours * costPerHour;
		amount = Math.round(amount * 100.0)/100.00;
		return amount;
	}
}
