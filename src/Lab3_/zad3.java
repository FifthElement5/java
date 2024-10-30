package Lab3_;

import java.util.Scanner;
import java.util.Random;

public class zad3 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 Random random = new Random();
		 int randomNumber = random.nextInt(200);
		 
		 // System.out.println("wylosowamo: " + randomNumber);
		 
		 System.out.println("zgadnij liczbe od 1 do 200: ");
		 int liczba = scanner.nextInt();
		 
		 if (liczba < randomNumber) {
			 
			 System.out.println("Liczba za mala!");
		 } else if (liczba > randomNumber) {
			 
			 System.out.println("Liczba za duza!");
		 } else {
			 
			 System.out.println("Gratulacje!! liczba to " + randomNumber);
		 }
		 
		 
		
		 
		 scanner.close();
	}

}
