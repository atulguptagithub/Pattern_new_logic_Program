package test;

import java.util.Scanner;

public class Pattern18 {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  n");
		int n=sc.nextInt();
		printPattern(n);
		
		
	}
	
	
	public static void printPattern(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				if(i==n||j==1||i+j==n+1) {
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
