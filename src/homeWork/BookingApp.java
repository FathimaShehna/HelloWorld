package homeWork;

import java.util.Scanner;

abstract class Ride {
		
		abstract int calculateFare(int distance);
		
		public void rideType() {
			System.out.println("Generic Ride");
		}
		
	}
	
	class AutoRide extends Ride {

		int calculateFare(int distance) {
			return (distance*10);
		}
		
		public void rideType() {
			System.out.println("Auto Ride");
		}
		
	}
	
	class CarRide extends Ride {

		int calculateFare(int distance) {
			return (distance*20);
		}
		
		public void rideType() {
			System.out.println("Car Ride");
		}
		
	}
	
	public class BookingApp {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			AutoRide auto = new AutoRide();
			CarRide car = new CarRide();
			
			System.out.println("Choose your ride type : auto/car");
			String rideType = sc.nextLine();
			
			System.out.println("How many distance in kilometers do you prefer?");
			int distanceKm = sc.nextInt();
			
			
			if(rideType.equals("auto")) {
				auto.rideType();
				int autofare = auto.calculateFare(distanceKm);
				System.out.println("Distance you chose is " +distanceKm);
				System.out.println("Total Fare is " +autofare);
			}
			else if (rideType.equals("car")) {
				car.rideType();
				int carfare = car.calculateFare(distanceKm);
				System.out.println("Distance you chose is " +distanceKm);
				System.out.println("Total Fare is " +carfare);
			}
			else {
				System.out.println("Choose either auto/car");
			}
			
		}
	
	}
