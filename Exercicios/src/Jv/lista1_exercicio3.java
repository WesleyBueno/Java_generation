package Jv;

import java.util.Scanner;

public class lista1_exercicio3 {

	public static void main(String[] args) {
		
		/*3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
		categoria ela se encontra:
		 10-14 infantil
		 15-17 juvenil
		 18-25 adulto*/
		
		Scanner minion = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Por favor, informe sua idade: ");
		idade = minion.nextInt();
		
		if(idade <10) {
			
			System.out.print("Voc� est� fora da categoria");
			
		}else if(idade>=10 && idade<=14){
			
			System.out.print("Voc� est� na categoria infantil");
		}else if(idade>=15 && idade<=17) {
			
			System.out.print("Voc� est� na categoria juvenil");
			
		}else if(idade>=18 && idade<=25) {
			
			System.out.print("Voc� est� na categoria adulto");
			
		}else
			System.out.print("Voc� n�o se encaixa em nenhuma categoria");

	}

}
