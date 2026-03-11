package PerformanceEsportiva;

import java.util.Scanner;

public class DivisaoDePremiacao {
	public static void main(String[] args) {
		double premio, estrutura, tecnica, jogadores, valor;

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o prêmio total: ");
		premio = ler.nextDouble();

		System.out.println("Informe a quantidade de jogadores: ");
		jogadores = ler.nextDouble();

		estrutura = ((premio * 50) / 100);
		tecnica = ((premio * 20) / 100);
		valor = ((premio - estrutura - tecnica) / jogadores);

		ler.close();

		System.out.println("O investimento na estrutura será de: " + estrutura);
		System.out.println("O comissão técnica será de: " + tecnica);
		System.out.println("O valor que cada jogador receberá é de: " + valor);

	}

}
