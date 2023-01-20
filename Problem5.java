package Assessment;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String inputString = scanner.nextLine();
		inputString = inputString.toLowerCase();
		
		//System.out.println(inputString);
		
		System.out.println("Enter the reference String");
		String refString = scanner.nextLine();
		refString=refString.toLowerCase();
		int []finalCount = new int[refString.length()];
		if(refString.length()==0) {
			System.out.println("Reference String is empty");
		}
		
		for(int index=0;index<refString.length();index++) {
			int count=0;
			int referIndex = index;
			while(referIndex<inputString.length()) {
				if(inputString.charAt(referIndex)==refString.charAt(index)) {
					count++;
				}
				referIndex++;
			}
			//System.out.println(refString.charAt(index)+" : "+ count);
			finalCount[index]=count;
			
		}
		
		for(int index=0;index<refString.length();index++) {
			System.out.println(refString.charAt(index)+" : "+finalCount[index]);
		}
		

	}

}
