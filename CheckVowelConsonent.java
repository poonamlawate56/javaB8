package controlstatements;

import java.util.Scanner;

public class CheckVowelConsonent {
	public void checkVowel(char ch) {
		
	System.out.println("____________________________");
	if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'
			||ch=='U') {
		System.out.println("|entered character "+ch+" is vowel|");
		
	}
	else {
		System.out.println("Enterd character is consonent");
	}
	System.out.print("____________________________");
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		CheckVowelConsonent obj=new CheckVowelConsonent();
		obj.checkVowel(ch);
		
		sc.close();
	}

}
