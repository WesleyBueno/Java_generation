package Jv;

import java.util.Arrays;
import java.util.Scanner;


	public class lista1_exercicio2 {
	
	public static void main(String[] args) {
	
	//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	
	Scanner minion = new Scanner(System.in);
	
	int[] listaNumeros = new int[3];
	
	for(int i=0;i<listaNumeros.length;i++) {
		
		System.out.println("Informe os valores: ");
		listaNumeros[i] = minion.nextInt();
		
	}
	
	Arrays.sort(listaNumeros);
	
	System.out.print("A ordem crescente �: ");
	for (int o=0;o<listaNumeros.length;o++) {
		
		System.out.print(listaNumeros[o]+" ");
	}
	
	}

}
