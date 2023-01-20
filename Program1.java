package Assessment;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String ex = scanner.nextLine();
		char [] exchar = new char[ex.length()];
		for(int i=0;i<ex.length();i++) {
			exchar[i]= ex.charAt(i);
		}
		int open=0;
		int close=0;
		boolean flag =true;
		int len = exchar.length;
		if(exchar[0]==')' || exchar[0]=='+' || exchar[0]=='-'|| exchar[0]=='/' || exchar[0]=='*' 
				|| exchar[len-1]=='+' || exchar[len-1]=='-'|| exchar[len-1]=='/' || exchar[len-1]=='*' || exchar[len-1]=='(') {
			System.out.println("Invalid");
		}
		else {
		for(int i=0;i<exchar.length;i++) {
			if(exchar[i]=='(') {
				
				if(open<close) {
					System.out.println("Invalid");
					flag =false;
					break;
				}
				else {
					open++;
				}
			}
			if(exchar[i]==')') {
				close++;
			}
			if(exchar[i]=='+' || exchar[i]=='-' || exchar[i]=='*' || exchar[i]=='+') {
				if(exchar[i-1]=='(' || exchar[i+1]==')') {
					System.out.println("Invalid");
					flag=false;
					break;
				}
			}
			
			
		}
		if(flag==true) {
		if(open==close) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		}
		}
		
		

	}

}
