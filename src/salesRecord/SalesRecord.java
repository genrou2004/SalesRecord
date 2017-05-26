package salesRecord;

import java.util.Scanner;

public class SalesRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable declaration
		 int customerNumber;
		 String customerName;
		 double salesAmount;
		 String taxCode;
		 double totalAmountDue;
		 String anotherRecord;
		//Creating object of a Scanner for user input
		Scanner scan = new Scanner(System.in);
		//Do while looping starts here
		  do {
			//Accepting user input
			System.out.println("Enter Customer number: ");
			customerNumber = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter Customer Name: ");
			customerName = scan.nextLine();
			//scan.nextLine();
			System.out.println("Enter sales amount: ");
			salesAmount = scan.nextDouble();
			System.out.println("Enter tax code (NRM, BIZ, NPF): ");
			taxCode = scan.next();
			
			System.out.println();
			//Checking the equality of the tax code, calculate the total amount due and ignore case
				if(taxCode.equalsIgnoreCase("NRM")){
					
					totalAmountDue = (salesAmount * 0.06) + salesAmount;
				}else if(taxCode.equalsIgnoreCase("BIZ")){
					totalAmountDue = (salesAmount * 0.045) + salesAmount;
				}else
					totalAmountDue = (salesAmount * 0.0) + salesAmount;
				
				//Displaying the output to the screen
				System.out.println("Customer ID: "+ customerNumber);
				System.out.println("Customer Name: "+customerName);
				System.out.println("Sales Amount: "+salesAmount);
				System.out.println("Tax Code: "+taxCode);
				System.out.println("Totoal Amount Due: "+totalAmountDue);
				System.out.println();
				//Prompting the user if they want to add more records 
				System.out.println("Do you want to enter another record? (Yes/No)");
				anotherRecord = scan.next();
				scan.nextLine();
				//The loop continues as far as the user answers yes and it is case ignored
		}while(anotherRecord.equalsIgnoreCase("Yes"));
		
		scan.close();
	}

}


