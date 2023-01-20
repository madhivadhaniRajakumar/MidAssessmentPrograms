package Assessment;

import java.util.ArrayList;
import java.util.Scanner;

public class Progrom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer>l2 = new ArrayList<>();
		//int target = sc.nextInt();
		int i;
		int sum=0;
		for(i=0;i<size;i++) {
			arr[i]= sc.nextInt();
			sum += arr[i];
		}
		sum=sum/2;
		int val = 0;
		
		for(int j=0;j<size;j++) {
			val += arr[j];
			if(val<=sum) {
				l1.add(arr[j]);
			}
			if(val>sum) {
				l2.add(arr[j]);
			}
			
		}
		
		System.out.println(l1);
		System.out.println(l2);
	

	}

}
