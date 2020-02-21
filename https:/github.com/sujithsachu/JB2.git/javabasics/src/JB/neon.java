package JB;

public class neon {

	public static void main(String[] args) {
		int A=15;
		int square=(A*A);
		int sum=0;
		while(square!=0)
		{
			 sum=sum+square%10;
			 square=square/10;
		}
		if(A==sum)
		{
			System.out.println("It is neon number");
		}
		else
		{
			System.out.println("Not a neon number");
		}

	}

}
