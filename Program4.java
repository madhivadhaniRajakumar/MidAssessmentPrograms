package Assessment;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Denomination of coins can be 1 rupee cin, 2 rupee coin, 5 rupees coin, 10 rupees coin;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of coins in each denomination");
		int coinone;
		int cointwo;
		int coinfive;
		int cointen;
		int amount;
		int numberOfOne=0,numberOfTwo=0,numberOfFive=0,numberOfTen=0;
		System.out.println("Enter the number of One rupee coin");
		coinone = scanner.nextInt();
		System.out.println("Enter the number of Two rupees coin");
		cointwo = scanner.nextInt();
		System.out.println("Enter the number of Five rupees coin");
		coinfive = scanner.nextInt();
		System.out.println("Enter the number of Ten rupees coin");
		cointen = scanner.nextInt();
		System.out.println("Enter the Total amount");
		amount = scanner.nextInt();
		//As value of the coin increases number of coins decreases. Hence checking from 10 to 1
		int val = amount/10;
		if(val!=0) {
		if(val<cointen) 
			numberOfTen = val;
		else 
			numberOfTen = cointen;
		amount = amount -(numberOfTen*10);
		}
		
		val = amount/5;
		if(val!=0) {
			if(val<coinfive) 
			 numberOfFive =val;
			else
			 numberOfFive=coinfive;
		amount= amount -(numberOfFive*5);
		}
		val = amount/2;
		if(val!=0) {
			if(val<cointwo)
				numberOfTwo=val;
			else
				numberOfTwo=cointwo;
		    amount = amount-(numberOfTwo*2);
		}
		val = amount/1;
		if(val!=0) {
			if(val<coinone)
				numberOfOne=val;
			else
				numberOfOne=coinone;
			amount=amount-(numberOfOne*1);
		}
		if(amount==0) {
			System.out.println("Coin 10 : " + numberOfTen );
			System.out.println("Coin 5 : " + numberOfFive);
			System.out.println("Coin 2 : " + numberOfTwo );
			System.out.println("Coin 1 : " + numberOfOne );

		}
		else
			System.out.println("-1");
		
		
		

	}
	

}
