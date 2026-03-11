package PerformanceEsportiva;

import java.util.Scanner;

public class TaxaCrescimentoDesempenho {
	public static void main(String[] args) {
		int metros, velocidade1, velocidade2, diferenca, metrosporsegundo1, metrosporsegundo2;

		Scanner ler = new Scanner(System.in);

		System.out.println("Metros percorridos: ");
		metros = ler.nextInt();

		System.out.println("Velocidade 1: ");
		velocidade1 = ler.nextInt();

		System.out.println("Velocidade 2: ");
		velocidade2 = ler.nextInt();

		ler.close();

		diferenca = (velocidade1 - velocidade2);
		metrosporsegundo1 = (metros / velocidade1);
		metrosporsegundo2 = (metros / velocidade2);
		System.out.println("A diferença entres as velocidades é: " + diferenca + " segundos");
		System.out.println("Metros por segundo 1: " + metrosporsegundo1 + "m/s");
		System.out.println("Metros por segundo 2: " + metrosporsegundo2 + "m/s");

	}

}
