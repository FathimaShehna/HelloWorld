package homeWork;


	interface Vehicle {
	    void start();
	    void stop();
	}
	
	
	interface FuelBased {
	    void refuel();
	}
	
	
	class Car implements Vehicle, FuelBased {
	
	    public void start() {
	        System.out.println("Car engine started.");
	    }
	
	    public void stop() {
	        System.out.println("Car engine stopped.");
	    }
	
	    public void refuel() {
	        System.out.println("Car is refueling at the station.");
	    }
	}
	
	
	class ElectricScooter implements Vehicle {
	
	    public void start() {
	        System.out.println("Electric scooter powered on.");
	    }
	
	    public void stop() {
	        System.out.println("Electric scooter powered off.");
	    }
	}
	
	
	public class RentalSystem {
	
	    public static void main(String[] args) {
	
	        
	        Car car = new Car();
	        car.start();
	        car.refuel();
	        car.stop();
	
	        
	        ElectricScooter scooter = new ElectricScooter();
	        scooter.start();
	        scooter.stop();
	    }
	}