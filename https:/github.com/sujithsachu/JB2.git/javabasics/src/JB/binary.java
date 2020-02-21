package JB;

public class binary {

	public static void main(String[] args) {
		int bin=1010;
		int sum=0;
		int i=0;
		while(bin!=0)
		{
			int rem=bin%10;
			sum=(int) ((int) sum+rem*Math.pow(2, i));
			bin=bin/10;
			i++;
		}
		
		System.out.println(sum);

	}

}
