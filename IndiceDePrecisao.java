package PerformanceEsportiva;

import java.util.Scanner;

public class IndiceDePrecisao {
	public static void main(String[] args) {
		double passes, tentativas, percentualprecisao;

		Scanner ler = new Scanner(System.in);

		System.out.println("Quantidade de tentativas: ");
		tentativas = ler.nextDouble();

		System.out.println("Quantidade de acertos: ");
		passes = ler.nextDouble();

		ler.close();

		percentualprecisao = (passes * 100) / tentativas;
		System.out.println("A porcentagem de precisão é de: " + percentualprecisao + "%");

	}

}
