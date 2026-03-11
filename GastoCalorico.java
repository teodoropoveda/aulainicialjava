package PerformanceEsportiva;

import java.util.Scanner;

public class GastoCalorico {
	public static void main(String[] args) {
		double calorias, minutos, caloriasgastas;

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a quantidade de calorias gastas por minuto: ");
		calorias = ler.nextDouble();

		System.out.println("Informe o tempo do exercício: ");
		minutos = ler.nextDouble();

		ler.close();

		caloriasgastas = (calorias * minutos);
		System.out.println("A quantidade de calorias gastas é de: " + caloriasgastas);

	}

}
