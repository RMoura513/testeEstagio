package teste;

public class Distribuidora {

	public static void main(String[] args) {

		float sp = (float) 67836.43;
		float rj = (float) 36678.66;
		float mg = (float) 29229.88;
		float es = (float) 27165.48;
		float outros = (float) 19849.53;
		
		float total;
		float percentual;
		
		total = sp + rj + mg + es + outros;
		
			percentual = sp/total * 100;
			System.out.println("percentual de SP: " + percentual);
			percentual = rj/total * 100;
			System.out.println("percentual de RJ: " + percentual);
			percentual = mg/total * 100;
			System.out.println("percentual de MG: " + percentual);
			percentual = es/total * 100;
			System.out.println("percentual de ES: " + percentual);
			percentual = outros/total * 100;
			System.out.println("percentual de Outros: " + percentual);

		
	}

}
