package Day3;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum=0;

	        Scanner input= new Scanner (System.in);

	        System.out.print("Enter the car no:");

	        int carNum = input.nextInt();

	        if(carNum<1000 || carNum>9999){

	            System.out.println(carNum+" is not a valid car number");

	        }

	        else{

	            while(carNum!=0){

	            int rem=carNum%10;

	            sum=sum+rem;

	            carNum=carNum/10;

	            }

	            if(sum%3==0||sum%5==0||sum%7==0){

	            System.out.println("Lucky Number");

	            }

	            else{

	            System.out.println("Sorry its not my lucky number");

	        }

	        }
	}

}
