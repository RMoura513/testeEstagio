package teste;

public class Pergunta3 {

	
	public static void main(String[] args) {

		float valor[] = new float[31];
		int i = 1;
		float a = 0;
		int b = 0;
		float soma = 0;
		float media = 0;
		int contagem = 0;
		
		valor[1] = (float) 22174.1664;
		valor[2] = (float) 24537.6698;
		valor[3] = (float) 26139.6134;
		valor[4] = (float) 0;
		valor[5] = (float) 0;
		valor[6] = (float) 26742.6612;
		valor[7] = (float) 0;
		valor[8] = (float) 42889.2258;
		valor[9] = (float) 46251.174;
		valor[10] = (float) 11191.4722;
		valor[11] = (float) 0;
		valor[12] = (float) 0;
		valor[13] = (float) 3847.4823;
		valor[14] = (float) 373.7838;
		valor[15] = (float) 2659.7563;
		valor[16] = (float) 48924.2448;
		valor[17] = (float) 18419.2614;
		valor[18] = (float) 0;
		valor[19] = (float) 0;
		valor[20] = (float) 35240.1826;
		valor[21] = (float) 43829.1667;
		valor[22] = (float) 18235.6852;
		valor[23] = (float) 4355.0662;
		valor[24] = (float) 13327.1025;
		valor[25] = (float) 0;
		valor[26] = (float) 0;
		valor[27] = (float) 25681.8318;
		valor[28] = (float) 1718.1221;
		valor[29] = (float) 13220.495;
		valor[30] = (float) 8414.61;
		
		
		for (i = 1; i < 31; i++) {
			if (a >= valor[i]) {
				a = valor[i];
				b = i;
			}
		}
		
		System.out.println("Dia com menor faturamento do mês: " + b + " - Faturamento: " + a);

		for (i = 1; i < 31; i++) {
			if (a <= valor[i]) {
				a = valor[i];
				b = i;
			}
			
		}
		
		System.out.println("Dia com maior faturamento do mês: " + b + " - Faturamento: " + a);
		
		for (i = 1; i < 31; i++) {
			soma += valor[i];
		}
		
		media = soma/30;
		
		for (i = 1; i < 31; i++) {
			if (valor[i] > media) {
				contagem++;
			}
		}
		
		System.out.println("Número de dias com faturamento acima da média mensal: " + contagem);

	}
}
