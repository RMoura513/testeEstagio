package teste;

import java.util.Scanner;


public class Pergunta5 {
	
	
	public static void main(String[] args) {
		
		String a = "";
		String b = "";
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite alguma palavra:");
		a = scan.nextLine();
		
		for(int i = a.length() - 1; i >= 0; i--) {
			b += a.charAt(i);
		}
		
		System.out.println(b);
		
		
	}
	

}
