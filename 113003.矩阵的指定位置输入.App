package lex;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
	
int array2d[][]=new int[10][10];
Scanner scanner=new Scanner(System.in);

int row=scanner.nextInt();
int column=scanner.nextInt();
int value=scanner.nextInt();

array2d[row][column]=value;
for(int row2=0;row2<array2d.length;row2++){
	for(int column2=0;column2<array2d.length;column2++){
		System.out.print(array2d[row2][column2]+" ");
		
	}
	System.out.println();
	
}
	}
}
