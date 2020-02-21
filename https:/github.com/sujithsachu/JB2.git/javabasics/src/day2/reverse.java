package day2;

public class reverse {

	public static void main(String[] args) {
		int no=121;int no1=no;
		
		int sum=0;
		int count=0;
		while(no>0)
		{
			if((count==0) && (no%10==0))
				System.out.print(0);
			sum=(sum)+no%10;
			no=no/10;
			count++;
		}
     System.out.println(sum);
     System.out.println(count);
     if(no1==sum)
     {
    	 System.out.println("this is palindrome");
     }
     else
     {
    	 System.out.println("this is not a palindrome");
     }
	}

}
