package Lab3_;

import java.util.Scanner;

public class zad4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int iloczyn = 1;
		
		System.out.println("Podaj liczby: ");
		
		while(true) {
			int liczba = scanner.nextInt();
			
			if(liczba == 5) {
				break;
			}
			
			iloczyn *= liczba;
		}
		
		System.out.println("iloczyn podanych licz to: " + iloczyn);
		scanner.close();		
	}
}
