package Lab3_;

import java.util.Scanner;

public class zad5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj liczbe: ");
		int liczba = scanner.nextInt();

		int wykladnik = 0;
		int podstawa = 3;

		// Obliczamy potęgę na początku pętli
		int potega = (int) Math.pow(podstawa, wykladnik);

		// Pętla do obliczania potęg mniejszych od wczytanej liczby
		while (potega < liczba) {
			System.out.println(potega); // Wypisujemy potęgę
			wykladnik++; // Zwiększamy wykładnik
			potega = (int) Math.pow(podstawa, wykladnik); // Obliczamy nową potęgę
		}

		scanner.close();
	}
}
