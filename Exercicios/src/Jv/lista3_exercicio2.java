package Jv;

import java.util.Scanner;

public class lista3_exercicio2 {
	
	public static void main(String[] args) {
		
	/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
*/
		
	
	
	Scanner leia = new Scanner(System.in);
	
	final int LIMITE =6;
	int numeros[] = new int [LIMITE] ;
	int par =0,impar= 0;
	int numeroPar[] = new int[LIMITE]; 
	int numeroImpar[] = new int[LIMITE];
	int somaPares =0;
	
	for(int i =0;i<LIMITE;i++) {
		System.out.printf("informe os valores dos n�meros: ");
		numeros[i] = leia.nextInt();
	
		
	}
	for(int i =0;i<LIMITE;i++) {
		
			if(numeros[i]%2 ==0) {
			somaPares = somaPares +numeros[i];
			numeroPar[i] = numeros[i];
			
			}else {
				
				numeroImpar[i] =numeros[i];
				impar = impar +1;
				
			}
		
	}
	
			for (int i = 0; i < numeros.length; i++) {
		
				if (numeros[i]%2==0) {
			System.out.printf("\nN�meros pares: %d",numeroPar[i]);
			
		}
		
	}
	
		for (int i = 0; i < numeros.length; i++) {
		
			if (numeros[i]%2!=0) {
			System.out.printf("\nN�meros impares: %d",numeroImpar[i]);
		}
		
		}
	
	System.out.printf("\nA soma dos n�meros pares digitados �: %d",somaPares);
	
	System.out.printf("\nA quantidade de n�meros �mpares foi de: %d",impar);
	}
}
