package test;

import java.util.Scanner;

public class Pattern13 {
	
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
				
				if(i==n/2+1||j==n/2+1||i==1||i==n||j==1||j==n) {
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
