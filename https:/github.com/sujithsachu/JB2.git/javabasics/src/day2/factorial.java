package day2;

public class factorial {

	public static void main(String[] args)
	{
		int A=5;
		int sum=1;
		for(int B=1;A>=1;B++)
		{
			sum=sum*A;
			//System.out.println(sum);
			A--;
		}
System.out.println(sum);
	}
}
