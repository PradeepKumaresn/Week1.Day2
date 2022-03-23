package Week1Day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A=11;
		int prime=0;
		
		for(int i =2; i <10; i++)
		{
			if(A%i==0)
			{
				prime++;
				break;
				
			}
			
		}
		if(prime==0)
		{
			System.out.println("prime no"); 
		}
		else
		{
			System.out.println("not prime no"); 
		}
		
	}
}


