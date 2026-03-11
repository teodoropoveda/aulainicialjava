package PerformanceEsportiva;

import java.util.Scanner;

public class EficienciaDeTreinos {
	public static void main(String[] args) {
		int treino1, treino2, treino3, total;

		Scanner ler = new Scanner(System.in);

		System.out.println("Duração do treino 1: ");
		treino1 = ler.nextInt();

		System.out.println("Duração do treino 2: ");
		treino2 = ler.nextInt();

		System.out.println("Duração do treino 3: ");
		treino3 = ler.nextInt();

		ler.close();

		total = (treino1 + treino2 + treino3);

		System.out.println("A duração total dos treinos da semana é de: " + total + " minutos");

	}

}
