package test;

public class Pattern23 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=n;j++)
			
			
		{
			if(i==1||j==1||i+j==n+1)
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
