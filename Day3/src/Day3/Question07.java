package Day3;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

        int num1=input.nextInt();

        int num2=input.nextInt();

        int temp;

        if(num1<=0 || num2<=0 || num1>=num2)

        System.out.println("Provide valid input");

        else

        {

    

            while(num1<=num2)

            {

                if(num1==2)

                System.out.print(num1+" ");

                else if(num1==1)

                {

                    num1++;

                    continue;

                }

                else

                {

                   temp=0;

                    outer:

                    for(int i=2;i<=num1/2;i++)

                    {

                        if(num1%i==0)

                        {

                           temp=1;

                            break outer;

                        }

                    }

                    if(temp==0)

                    System.out.print(num1+" ");

                }

                num1++;

            }

        }
	}

}
