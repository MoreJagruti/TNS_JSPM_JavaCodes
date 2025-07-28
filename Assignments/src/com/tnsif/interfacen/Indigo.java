package com.tnsif.interfacen;

public class Indigo implements AirFare{

		double amount;
		int hours;
		double costPerHour;

		public Indigo() {
		}

		public Indigo(int hours, double costPerHour) {
			this.hours = hours;
			this.costPerHour = costPerHour;
		}

		@Override
		public double calculateAmount() {
			amount = 8*hours * costPerHour;
			amount = Math.round(amount * 100.0)/100.00;
			return amount;
		}
}
