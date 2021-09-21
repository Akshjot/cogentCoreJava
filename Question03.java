import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the digits:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
       
        char a = (char)num1;
        char b = (char)num2;
        char c = (char)num3;
        char d = (char)num4;
       
        System.out.println(num1 + "-" + a);
        System.out.println(num2 + "-" + b);
        System.out.println(num3 + "-" + c);
        System.out.println(num4 + "-" + d);

	}

}
