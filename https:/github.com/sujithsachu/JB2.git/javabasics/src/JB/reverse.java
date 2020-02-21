package JB;

public class reverse {

	public static void main(String[] args) {
		int rev=123;
		while(rev>0)
		{
			int rem=rev%10;
			System.out.println(rem);
			rev=rev/10;
		}

	}

}
