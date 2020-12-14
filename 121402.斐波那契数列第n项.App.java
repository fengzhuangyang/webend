package viour;

import java.util.Scanner;

public class java121401 {
	
	public int Fibonacci(int n) {
		int a=40;
	 if(n==0)
     {
         return 0;
     }
     if(n==1)
     {
         return 1;
     }
     int arr[]=new int[n+1];
     arr[0]=0;
     arr[1]=1;
     if(n<=40) {
     for(int i=2;i<=n;i++)
     {
         arr[i]=arr[i-1]+arr[i-2];
     }
     }
     return arr[n];
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	java121401 fei = new java121401();
	System.out.println(fei.Fibonacci(n));
	}
}
