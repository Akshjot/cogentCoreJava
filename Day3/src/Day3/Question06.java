package Day3;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the month:");

        Scanner input = new Scanner(System.in);

        int month = input.nextInt();

          switch (month)

            {

                case 12:

                case 1:

                case 2:

                System.out.println("Season:Winter");

                break;

                case 3:

                case 4:

                case 5:

                System.out.println("Season:Spring");

                break;

                case 6:

                case 7:

                case 8:

                System.out.println("Season:Summer");

                break;

                case 9:

                case 10:

                case 11:

                System.out.println("Season:Autumn");

                break;

                default:

                System.out.println("Invalid month");

           }

	}

}
