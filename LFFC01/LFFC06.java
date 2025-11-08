package LFFC01;

import java.util.Scanner;

public class LFFC06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC06 - Múltiplo de 3 e/ou 5 *");
	        System.out.println("***********************************");
 

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        if (numero % 3 == 0 && numero % 5 == 0) {
	            System.out.println("O número " + numero + " é múltiplo de 3 E de 5.");
	        } 
	        else if (numero % 3 == 0) {
	            System.out.println("O número " + numero + " é múltiplo apenas de 3.");
	        } 
	        else if (numero % 5 == 0) {
	            System.out.println("O número " + numero + " é múltiplo apenas de 5.");
	        } 
	        else {
	            System.out.println("O número " + numero + " não é múltiplo de 3 nem de 5.");
	        }

	        scanner.close();

	}

}
