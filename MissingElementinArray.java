package Week1Day1;

import java.util.Arrays;

public class MissingElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A[]= {1,2,3,4,5,7,8};
Arrays.sort(A);
for(int i=A[0]; i<A.length; i++)
{
	if(i!=A[i-1])
	{
		System.out.println(i);
		break;
	}
}
	}

}
