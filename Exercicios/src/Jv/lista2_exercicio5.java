package Jv;

import java.util.Scanner;

public class lista2_exercicio5 {

		public static void main(String[] args) {
			
			/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
			 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
*/
			
			Scanner leia = new Scanner(System.in);
			int i =0;
			int somaValores = 0;
			do {
				System.out.printf("Informe um n�mero: ");
				i = leia.nextInt();
				
				somaValores = somaValores + i;
				
			} while(i !=0); 
				
				
			System.out.printf("\nA soma dos valores �: %d",somaValores);
		}
}
