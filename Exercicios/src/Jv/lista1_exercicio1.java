package Jv;

import java.util.Scanner;


public class lista1_exercicio1 {

	public static void main(String[] args) {
		//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner minion = new Scanner(System.in);
		
		int[] vetor = new int[3];
		
		int maiorNumero = 0;
		
		for(int i = 0; i < vetor.length; i++) {
		System.out.print("Informe os valores: ");
		vetor[i] = minion.nextInt();
		
		if(vetor[i]>maiorNumero) {
			maiorNumero =vetor[i];
		}
	
		}
		
		System.out.println("O maior valor �: "+maiorNumero);
		
	}

}
