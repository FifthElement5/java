package Lab3_;

import java.util.Scanner;

public class zad2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj liczbe: ");
		
		int liczba = scanner.nextInt();
		for (int i = 1; i <= liczba; i++) { 
			if (liczba % i == 0) {
				System.out.println(i);
			}
			
		}
		
		scanner.close();
	}

}
