package Day3;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);

		     int num = input.nextInt();

		     int sum = 0;
		     int rem;

		     int temp = num;

		     if(num>-1){

		     while(num>0)

		       {    

		        rem = num % 10;   

		        sum = (sum*10)+rem;    

		        num = num/10;    

		       }    

		      if(temp==sum)    

		        System.out.println("Palindrome");    

		      else    

		        System.out.println("Not a Palindrome");    

		     }

		     else{

		         System.out.println("Invalid Input");

		     }

	}

}
