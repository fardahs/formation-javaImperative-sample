//package tp3.tableau.boucle;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner questionUser = new Scanner(System.in);
		
		System.out.println("1. Ajouter un nombre");
		System.out.println("2. Afficher les nombres existants");
		
		int choixMenu = questionUser.nextInt();
		
		int array1[] = new int[0];
		int array2[] = {12,20,3,14};
		
		//agrandi le tableau
		int tempArray[] = new int[array1.length+1];
		switch (choixMenu) {
		case 1:
			System.out.println("Entrez un nombre ");
			int nombreUser = questionUser.nextInt();
			tempArray[array1.length] = nombreUser;
			array1 = tempArray;
			for(int i = 0; i<array2.length; i++){
				System.out.print(array1[i] + " ");
			}
			break;
		
		case 2:
			for(int i = 0; i<array2.length; i++){
				System.out.print(array2[i] + " ");
			}
			
			break;
			
		default:
			System.out.println("Entrez 1 ou 2");
			break;
		}
	}

}
