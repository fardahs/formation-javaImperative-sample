//package tp3.tableau.boucle;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int tailleTableau = array.length;
		System.out.println("Affichage des éléments du tableau ");
		for(int i=0; i<tailleTableau;i++){
			System.out.print(array[i] + " ");
		}
		
		System.out.println(" \n \nAffichage des éléments du tableau dans l'odre inverse");
		for(int i=tailleTableau-1; i>=0;i--){
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\n \nEntiers supérieurs a 3");
		for (int i = 0; i < tailleTableau; i++) {
			if(array[i] > 3){
				System.out.print(array[i] + " ");
			}
		}
		
		System.out.println("\n \nEntiers pairs");
		for (int i = 0; i < tailleTableau; i++) {
			if(array[i] % 2 == 0){
				System.out.print(array[i] + " ");
			}
		}
		
		System.out.println("\n \nLe plus grand élément");
		int max = 0;
		for (int i = 0; i < tailleTableau; i++) {
			if(array[i] > max){
				max = array[i];		
			}	
		} System.out.println(max);
		
		
		System.out.println("\n \nLe plus petit élément");
		int min = 0;
		for (int i = 0; i < tailleTableau; i++) {
			if(array[i] < min){
				min = array[i];		
			}	
		} System.out.println(min);

	}

}
