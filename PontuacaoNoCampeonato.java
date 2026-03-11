package PerformanceEsportiva;

import java.util.Scanner;

public class PontuacaoNoCampeonato {
	public static void main(String[] args) {
		double pontuacaototal, vitoria, empate;
		
		Scanner campeonato = new Scanner(System.in);
		System.out.println("Informe a quantidade de vitórias: ");
		vitoria = campeonato.nextDouble();
		
		System.out.println("Informe a quantidade de empates: ");
		empate = campeonato.nextDouble();
		
		campeonato.close();
		
		pontuacaototal = (vitoria *  3 + empate * 1);
		
		System.out.println("A pontuação total é:" + pontuacaototal + " pontos");
	}
}
