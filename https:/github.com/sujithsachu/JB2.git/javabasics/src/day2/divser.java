package day2;

public class divser {

	public static void main(String[] args) {
	int no=7;
	int div=2;
	while(div<=no)
	{
		if(no%div==0)
		{
			System.out.println(div);
			break;
		}
		div++;
	}

	}

}
