package controlstatements;

import java.util.Scanner;

public class GretestNumber {
	public void checkGreterNumber(int num1,int num2,int num3) {
		if(num1>num2&&num1>num3) {
			System.out.println(num1+" is gretest among these three numbers");
		}
		else if(num2>num1&&num2>num3) {
			System.out.println(num2+" is gretest");
		}
		else {
			System.out.println(num3+" is gretest");
		}
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello");
		System.out.println("Enter three numbers->");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		GretestNumber obj=new GretestNumber();
		obj.checkGreterNumber(num1, num2, num3);
	}

}
