package Jv;

import java.util.Scanner;

public class lista1_exercicio4 {

	public static void main(String[] args) {
	/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		�mpar exiba o n�mero elevado ao quadrado.*/
		
		Scanner minion = new Scanner(System.in);
		
		int valorUsuario;
		int raiz;
		int quadrado;
		
		
		System.out.print("Informe um valor: ");
		valorUsuario = minion.nextInt();
		
		
		if(valorUsuario>0) {
			
			if((valorUsuario%2) == 0) {
				
				raiz =(int) Math.sqrt(valorUsuario);
				System.out.println("O valor � positivo e par! \nE sua raiz �: "+raiz);
			}else {
				
				quadrado = (int) Math.pow(valorUsuario, 2);
				System.out.println("O valor � positivo e impar! \nE seu quadrado  �: "+quadrado);
			}
				
		}else if(valorUsuario == 0){
			
			System.out.print("Voc� digitou 0!");
			
		}else {
			
			System.out.println("Voc� digitou um n�mero negativo");
		}
		
	}
		
		
	
}
