//package tp3.tableau.boucle;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int tailleTableau = array.length;
		
		System.out.println("Moyenne des éléments");
		int somme = 0;
		for(int i = 0; i < array.length; i++){
			somme = somme + array[i];
		}
		System.out.println((somme/tailleTableau));
		
		System.out.println("Index tableau de l'entier 15");
		for(int i = 0; i<tailleTableau; i++){
			if(array[i]== 15){
				System.out.println(i);
				break;
			}
		}
		
		System.out.println("Nombre d'entier en doublon");
		int doublon = 0;
		
		for (int i = 0; i < tailleTableau; i++) {
			for(int j=i; j <tailleTableau; j++){
				if(array[j] == array[i] && i != j){
					doublon = doublon + 1;
				}
			}
		}
		System.out.println(doublon);
	}

}
