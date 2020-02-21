package JB;

public class decimal {

	public static void main(String[] args) {
	   int dec=4;
	   int sum=0;
	   String binary="";
	   while(dec!=0)
	   {
		   int rem=dec%2;
		    binary=rem+binary;
		    dec=dec/2;
		    
	   }
	   System.out.println(binary);

	}

}
