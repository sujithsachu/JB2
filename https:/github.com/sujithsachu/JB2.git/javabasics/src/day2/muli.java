package day2;

public class muli {

	public static void main(String[] args) {
		int no=80;
		int div=2;
		while(div<no/2)
		{
			if(no/div==div)
			{
				System.out.println(div+ " root");
			}
			div++;
		}

	}

}
