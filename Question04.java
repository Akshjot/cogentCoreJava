import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int CSE;
		int ECE;
		int MECH;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no of students for CSE");
		CSE = input.nextInt();
		System.out.println("Enter no of students for ECE");
		ECE = input.nextInt();
		System.out.println("Enter no of students for MECH");
		MECH = input.nextInt();
		
		//negative input
		if(CSE < 0 || MECH < 0 || ECE < 0)
		{
			System.out.println("Invalid inputs");
			System.exit(0);
		}
		
		System.out.println("Highest Placement: ");
		
		//all equal
		if(CSE == ECE && CSE == MECH)
		{
			System.out.println("None got the highest placement");
			System.exit(0);
		}
		
		//two equals one unequal
		if(CSE == MECH && CSE != ECE)
		{
			System.out.println("CSE");
			System.out.println("MECH");
			System.exit(0);
		}
		else if(CSE != MECH && CSE == ECE)
		{
			System.out.println("CSE");
			System.out.println("ECE");
			System.exit(0);
		}
		else if(ECE == MECH && CSE != ECE)
		{
			System.out.println("ECE");
			System.out.println("MECH");
			System.exit(0);
		}
		
		//one highest
		if(CSE > MECH && CSE > ECE)
		{
			System.out.println("CSE");
			System.exit(0);
		}
		else if(MECH > CSE && MECH > ECE)
		{
			System.out.println("MECH");
			System.exit(0);
		}
		else
		{
			System.out.println("ECE");
			System.exit(0);
		}
		
		
	}

}
