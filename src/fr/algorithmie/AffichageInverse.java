package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		
		// Afficher l'ensemble des �l�ments du tableau gr�ce � une boucle
		AffichageInverse.elementArray(array);
		// Afficher l'ensemble des �l�ments du tableau invers�
		AffichageInverse.elementArrayInverse(array);
		// Cr�er un tableau arrayCopy et copier tous les �l�ments de array dans arrayCopy
		AffichageInverse.copierUnTableau(array);
	}
	
	private static void elementArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("element du tableau " + array[i]);
		}
	}
	
	private static void elementArrayInverse(int[] array) {
		for(int i =  array.length - 1; i >= 0; i--) {
			System.out.println("element de array invers�s " + array[i]);
		}
	}
	
	private static void copierUnTableau(int[] array) {
		int[] copyArray = Arrays.copyOf(array, array.length);
		for (int i = 0; i < copyArray.length; i++) {
			System.out.println("element copie array " + copyArray[i]);
		}
	}

}
