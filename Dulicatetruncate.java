package Week1Day1;

import java.util.Arrays;

public class Dulicatetruncate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {12,12,13,14,15,16,14,17,13};
		
		//int dup=A.length;
		Arrays.sort(A);
		 for(int i = 0; i<A.length; i++)
		 {
			 for(int j =0; j<i; j++)
			 {
			 
			 if(A[i]==A[j])
			 {
				 System.out.println(A[i]);
			 }
		 }
	}

	}
}
