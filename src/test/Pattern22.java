package test;

public class Pattern22 
{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j||i==n||j==1)
				{
					System.out.print("* ");
				}
				
				else
				{
					  System.out.print("  ");
				}
			}
			
			System.out.println();
			
		}
	}
}