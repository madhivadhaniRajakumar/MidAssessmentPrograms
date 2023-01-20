package Assessment;

import java.util.ArrayList;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] s1 = new String[] {"ceo","alco","caaeio","ceai"};
		String [] s2 = new String[] {"ec","oc","ceo"};
		
		ArrayList<String> ar = new ArrayList<>();
		
		for(int i=0;i<s1.length;i++) { //4
			String toCheck = s1[i];   //ceo
			
			int j=0;
			int count=0;
			int num =0;
			while(j<s2.length) {
				num += s2[j].length();
				int k=0;
				//System.out.println(s2.length);
				while(k<s2[j].length()) {
					//System.out.println(s2[j].length()+" "+k);
					int l=0;
					while(l<toCheck.length()) {
						if(s2[j].charAt(k)==toCheck.charAt(l)) {
							count++;
							//System.out.println(count);
							break;
						}
						l++;
					}
					k++;
				}
				j++;
					
			}
			if(count==num) {
				ar.add(toCheck);
			}
		
		}
		System.out.println(ar);

	}

}
