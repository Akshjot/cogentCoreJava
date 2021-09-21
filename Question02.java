import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pricePerPizza = 100;
		int pricePerPuff = 20;
		int pricePerDrink = 10;
		int total = 0;
		
		int pizzas,puffs,drinks,pizzaPrice,puffPrice,drinkPrice;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Number of pizzas bought: ");
		pizzas = input.nextInt();
		System.out.println("Number of puffs bought: ");
		puffs = input.nextInt();
		System.out.println("Number of cool drinks bought: ");		
		drinks = input.nextInt();
		
		pizzaPrice = pricePerPizza * pizzas;
		puffPrice = pricePerPuff * puffs;
		drinkPrice = pricePerDrink * drinks;
		total = pizzaPrice + puffPrice + drinkPrice;
		
		System.out.println("Bill Details: ");
		System.out.println("No. of pizzas: " + pizzas);
		System.out.println("No. of puffs: " + puffs);
		System.out.println("No. of cool drinks: " + drinks);
		System.out.println("Total: " + total);
		System.out.println("ENJOY THE SHOW!!!");
	}

}
