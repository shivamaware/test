package com.Shivam.FirstJavaPoject;

public class MultiplicationTable {
	void print()
	{
	//for(int i=1;i<=10;i++)
	{
		print(5);
		//System.out.printf("%d * %d = %d", 5 , i , 5*i).println();
	}
	}
	void print(int table)
	{
	//for(int i=1;i<=10;i++)
	{
		print(table,1,10);
		//System.out.printf("%d * %d = %d", table , i , table*i).println();
	}
	}
	void print(int table, int from, int to)
	{
	for(int i=from;i<=to;i++)
	{
		System.out.printf("%d * %d = %d", table , i , table*i).println();
		System.out.println("This print line is for practice of GitHub not related to our Multiplication Table code");
	}
	}
}
