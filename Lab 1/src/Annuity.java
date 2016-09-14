//Lab Section 30, Group 4, Jason Hickman, Xiaxin Zhang, Yifan Li
import java.util.Scanner;

public class Annuity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
//These are all of the variables given by the user:
		System.out.println("Enter the number of years you plan to work.");
		double yearsWorking = input.nextDouble();
		
		System.out.println("Enter the expected percent annual return while working.");
		double annualReturn1 = input.nextDouble();
		
		System.out.println("Enter the number of years you plan to retire.");
		double yearsRetired = input.nextDouble();
		
		System.out.println("Enter the expected percent annual return while retired.");
		double annualReturn2 = input.nextDouble();
		
		System.out.println("Enter your required monthly income when retired.");
		double requiredIncome = input.nextDouble();
		
		System.out.println("Enter your expected monthly Social Security payment.");
		double SSI = input.nextDouble();
		
		//Present Value Function of the Annuity - Determines how much money you must have saved
		double amountSaved = (requiredIncome-SSI)*(1-Math.pow(1+annualReturn2/1200, 0-yearsRetired*12))/(annualReturn2/1200);
		
		//Future Value Function of the Annuity - Determines how much money must be saved each month
		double monthlyPayments = ((annualReturn1/1200)*amountSaved)/(Math.pow(1+(annualReturn1/1200), yearsWorking*12)-1);
		
		//Rounds numbers to 2 decimal places
		double amountSavedRounded = Math.round(amountSaved*100.0)/100.0;
		double monthlyPaymentsRounded = Math.round(monthlyPayments*100.0)/100.0;
		

		System.out.println("You must save " + amountSavedRounded + " dollars by retirement.");
		System.out.println("You must save " + monthlyPaymentsRounded + " dollars each month.");
	}

}
