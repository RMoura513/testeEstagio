package teste;

import java.util.Scanner;

public class Pergunta2 {
	
	public static int a;
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número entre 0 e 1.500");
		a = scan.nextInt();
		
		testes();	
	}
	
	public static void testes() {
		
		boolean status = false;
		
		int b = 0;
		int c = 1;
		int soma = 0;
		
		while (soma < 1000 & status == false) {
			
		soma = b + c;
		b = c;
		c = soma;

		
		if (soma == a) {
			System.out.println("O número digitado pertence à sequência de Fibonacci!");
			status = true;
		}
		
		if (soma == 1597 & status == false) {
			System.out.println("O número digitado não pertence à sequência de Fibonacci!");
			status = false;
		}
		
		}
	}
	

}
