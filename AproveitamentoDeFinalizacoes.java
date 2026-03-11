package PerformanceEsportiva;

import java.util.Scanner;

public class AproveitamentoDeFinalizacoes {
	public static void main(String[] args) {

		double chutes, gols, aproveitamento;

		Scanner performance = new Scanner(System.in);

		System.out.println("Informe o total de chutes: ");
		chutes = performance.nextDouble();

		System.out.println("Informe o total de gols: ");
		gols = performance.nextDouble();

		performance.close();

		aproveitamento = ((gols / chutes) * 100);

		System.out.println("O aproveitamento do atleta é de: " + aproveitamento + "%");

	}

}
