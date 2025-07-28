package com.tnsif.interfacen;
import java.math.*;
public class AirIndia implements AirFare{
	double amount;
	int hours;
	double costPerHour;

	public AirIndia() {
	}

	public AirIndia(int hours, double costPerHour) {
		this.hours = hours;
		this.costPerHour = costPerHour;
	}

	@Override
	public double calculateAmount() {
		amount = this.hours * this.costPerHour;
		amount = Math.round(amount * 100.0)/100.00;
		return amount;
	}
}
