package vatamountCalculation;

import java.util.Scanner;


public class vatAmount {
	private static Scanner scan;

	public record Scannerr() {

	}
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		double price,total,vatPrice,rate=19;
		
		System.out.print("enter amount :");
		price=scan.nextDouble();
		
		vatPrice=price+(rate/100);
		total=vatPrice+price;
		System.out.println("vat rate : %" + rate);
		System.out.println("vat amoun :"+vatPrice);
		System.out.println("amoun with vat"+total);
		
	
	
	
	
	   }
	
	}


