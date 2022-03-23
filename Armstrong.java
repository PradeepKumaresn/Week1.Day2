package Week1Day1;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=153;
		int orginalnumber = i;
		int sum=0;
		
		while(i>0)
		{
			int reminder = i%10;
			//sum += Math.pow(reminder, 3);
			sum = (reminder*reminder*reminder)+ sum;

			i = i/10;
			System.out.println(sum);
		}
		if(orginalnumber==sum) {
			System.out.println("Armstrong num");
		}
		else {
			
			System.out.println("Not Armstrong num");
		}


	}


}
