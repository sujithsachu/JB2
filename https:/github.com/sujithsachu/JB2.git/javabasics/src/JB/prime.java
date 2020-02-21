package JB;

public class prime {

	public static void main(String[] args) {
		int AA=3;
		int div=3;
		boolean check=true;
		if(AA==2)
		{
			System.out.println("its  prime number");
		}
		if(AA%2==0)
		{
			System.out.println("its not prime number ");
		}
		else
		{
			while(div<AA)
			{
				if(AA%div==0)
				{
					System.out.println("its not prime");
					check=false;
				}
				div=div+2;
			}
			if(check==true)
			{
				System.out.println("its prime number");
			}
		}

	}

}
