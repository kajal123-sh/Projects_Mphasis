package com.simplilearn.operators;

public class Operators {

	public static void main(String[] args) {
		// Unary operator
		int a = 4;
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(a);
		
		//Arithmrtic operator
		int b = 4;
		System.out.println(a+b);
		System.out.println(2%2);
		
		//Relational operator
		System.out.println(4<5);
		
		//Equality operator
		System.out.println(6!=4);
		//Logical operators && and ||
				System.out.println(true && true);
				System.out.println(false && true);
				System.out.println(1==1 && 1==2);
				
				System.out.println(1==1 || 1==2);
				
				//Shift operators	<< >> 
				// a<<b		
				// 0	0	0	0	0	0	0	1
				// 0	0	0	0	0	1	0	0
				// a * (2^b) == 10 * (8)  80
				System.out.println(10 << 1);
				System.out.println(10 << 2);
				System.out.println(10 << 3);
				
				// a>>b - Right shift operators
				// a/ (2^b)
				// 20/2 == 10
				// 10/2 = 5
				// 5/ 2 = 2
				System.out.println(10 >> 1);
				System.out.println(20 >> 3);
				// Ternary operator (Condition) ? Y : F
				System.out.println(  (1==1) ? 5 : 2  );
				 		


		
		
	

	}

}
