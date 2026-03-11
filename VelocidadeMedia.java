package PerformanceEsportiva;

import java.util.Scanner;

public class VelocidadeMedia {
	public static void main(String[] args) {
		double tempo, distancia, velocidademedia;

		Scanner conta = new Scanner(System.in);

		System.out.println("Informe a distância (em Km): ");
		distancia = conta.nextDouble();

		System.out.println("Informe o tempo (em minutos): ");
		tempo = conta.nextDouble();

		conta.close();

		velocidademedia = (distancia / tempo);

		System.out.println("A velocidade média é de " + velocidademedia + " Km por minuto");

	}
}
