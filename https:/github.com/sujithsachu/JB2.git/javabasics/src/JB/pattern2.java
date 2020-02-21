package JB;

public class pattern2 {

	public static void main(String[] args) {
		int row=10;
		int coloun=10;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=coloun;j++)
			{
				System.out.print("*");
			}
			coloun--;
			System.out.println();
		}

	}

}
