package JB;

public class armstrong {

	public static void main(String[] args) {
		int AA=121;
		int BB=AA;
		int sum=0;
		while(AA!=0)
		{
		int rem=AA%10;
	
		sum=sum+(rem*rem*rem);
		AA=AA/10;
			
		}
		if(BB==sum)
		{
			System.out.println(" its armstrong number");
		}
		else
		{
			System.out.println("Its is not armstrong number");
		}
	

	}

}
