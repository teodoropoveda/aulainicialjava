package PerformanceEsportiva;

import java.util.Scanner;

public class MediaPontosPorJogo {
	public static void main(String[] args) {
		double pontos, jogos, media;

		Scanner ler = new Scanner(System.in);

		System.out.println("Quantidade de jogos: ");
		jogos = ler.nextDouble();

		System.out.println("Quantidade de pontos: ");
		pontos = ler.nextDouble();
		ler.close();

		media = (pontos / jogos);
		
		System.out.println("A média de pontos por jogo é de: " + media + " pontos.");
		

	}

}
