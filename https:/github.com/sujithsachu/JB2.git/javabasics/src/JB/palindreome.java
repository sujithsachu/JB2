package JB;

public class palindreome {

	public static void main(String[] args) {
	int rev=124;
	int pal=rev;
	int sum=0;
	while(rev!=0)
	{
		 sum=(sum*10)+rev%10;
		 rev=rev/10;
	}
	if(pal==sum)
	{
		System.out.println("its pailndrome");
	}
	else
	{
		System.out.println("its not palindrome");
	}
	}

}
