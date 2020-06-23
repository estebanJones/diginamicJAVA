package fr.boucles;

public class ExerciceTableauEntier {
	public static void main(String[] args) {
		// D�clarez un tableau d'entiers contenant tous les entiers de 1 � 10
		int[] tableauInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// Affichez le premier �l�ment du tableau
		ExerciceTableauEntier.premierElementTableau(tableauInt);
		// Affichez la longueur du tableau en utilisant la propri�t� length
		ExerciceTableauEntier.longueurDeTableau(tableauInt);
		// Affichez le dernier �l�ment du tableau en utilisant la propri�t� length
		ExerciceTableauEntier.showLastElement(tableauInt);
		// Modifiez la valeur de l'�l�ment d'index 4 et donnez lui la valeur 8
		ExerciceTableauEntier.modifierIndex(tableauInt, 4, 8);
	}
	
	public static void premierElementTableau(int[] tableau) {
		System.out.println("premier element du tableau " + tableau[0]);
	}
	
	public static void longueurDeTableau(int[] tableau) {
		System.out.println("La longueur du tableau est " + tableau.length);
	}
	
	public static void showLastElement(int[] tableau) {
		int dernierIndex = tableau.length - 1;
		System.out.println("le dernier element du tableau est " + tableau[dernierIndex]);
	}
	
	public static void modifierIndex(int[] tableau, int index, int valeur) {
		tableau[index] = valeur;
		for(int i = 0; i < tableau.length; i++) {
			System.out.println("elements du tableau " + tableau[i]);
		}
	}
}
