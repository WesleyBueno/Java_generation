package portugol;

import java.util.Scanner;

public class lista1_exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner minion = new Scanner(System.in);
		
		int anos;
		int meses;
		int dias;
		int idade;
		
		System.out.println("Informe sua idade em dias");
		idade = minion.nextInt();
		
		anos=idade/365;
		
		System.out.println("Sua idade em anos �;"+anos);
		
		meses=(idade%365)/30;
		
		System.out.println("Sua idade em meses �: "+meses);
		
		dias=(idade%365)%30;
		System.out.println("Sua idade em dias �: "+dias);
		
		
		
	}

}
