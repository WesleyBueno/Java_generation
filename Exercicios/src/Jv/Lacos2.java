package Jv;

import java.util.Scanner;

public class Lacos2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		/*LA�O QUE MOSTRE NA TELA UMA SEQUENCIA DE NUMEROS DE 1 A 1000
		  PARA - ENQUANTO - FA�A ENQUANTO ,O USUARIO DECIDE SE CONTINUA OU N�O

		 * 
		 */
		int numero = 1;
		char resposta;
		do
		{
			System.out.print(numero+",");
			numero++;
			System.out.print("Quer continuar. S-sim e N-n�o");
			resposta = leia.next().toUpperCase().charAt(0);
			if(resposta =='N' ) {
				System.out.println("Fim do programa!!!");
				break;
			}
		
		} while(numero<1000);
		
	
	}

}
