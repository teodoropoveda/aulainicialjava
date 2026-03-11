package PerformanceEsportiva;

import java.util.Scanner;

public class MediaDeGols {
	public static void main(String[] args) {
		//ENTRADA
		
		double gols, partida, media;
		
		Scanner acertos = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de partidas: ");
		partida = acertos.nextDouble();
		
		System.out.println("Informe a quantidade de gols: ");
		gols = acertos.nextDouble();
		
		acertos.close();
		//PROCESSAMENTO
		media = (gols/partida);
		
		//SAIDA
		System.out.println("A média de gols por partida é: " + media);
		
		
	}

}
