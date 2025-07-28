package com.tnsif.interfacen;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Enter your choice :\n1.AirIndia\n2.KingFisher\n3.Indigo\n4.Exit");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("First Line : choice\nSecond Line : hours\nThird Line : costPerHour");
			System.out.println("-----------------------------------------------------------------------");
			int choice = scanner.nextInt();
			int hours = scanner.nextInt();
			double costPerHour = scanner.nextDouble();
			switch(choice){
			case 1:
				AirIndia air1 = new AirIndia(hours ,costPerHour);
				System.out.println(air1.calculateAmount());
				break;
			case 2:
				KingFisher air2 = new KingFisher(hours,costPerHour);
				System.out.println(air2.calculateAmount());
				break;
			case 3:
				Indigo air3 = new Indigo(hours,costPerHour);
				System.out.println(air3.calculateAmount());
				break;
			case 4:
				System.exit(1);
				break;
			default:
				System.out.println("\nInvalid choice entered");
			}}

	}

}
