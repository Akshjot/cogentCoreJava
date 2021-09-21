import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner fuelInput = new Scanner(System.in);
		System.out.println("Enter the no of litres to fill the tank");
		double fuel = fuelInput.nextDouble();
		if(fuel < 0)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		Scanner distInput = new Scanner(System.in);
		
		System.out.println("Enter the distance covered");
		double distance = distInput.nextDouble();
		if(distance < 0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		double consumption = (fuel/distance) * 100;
		
		double fuelGal = fuel * 0.2642;
		double distMiles = distance * 0.6214;
		
		double USconsumption = (distMiles/fuelGal);
		
		System.out.println("Litres/100KM: ");
		System.out.printf("%.2f", consumption);
		System.out.println(" ");
		System.out.println("Miles/Gallon: ");
		System.out.printf("%.2f", USconsumption);
		
	}

}
