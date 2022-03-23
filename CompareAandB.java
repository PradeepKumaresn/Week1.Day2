package Week1Day1;

import java.util.Arrays;

public class CompareAandB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A[] = {12,10,13,11,14,15,16,9,17,8};
int B[] = {12,11,13,9,15,16,14,17,10};
		
		//int dup=A.length;
		Arrays.sort(A);
		 for(int i = 0; i<A.length; i++)
		 {
			 for(int j =0; j<B.length; j++)
			 {
			 
			 if(A[i]==B[j])
			 {
				 System.out.println(A[i]);
			 }
		 }
	}


	}

}
