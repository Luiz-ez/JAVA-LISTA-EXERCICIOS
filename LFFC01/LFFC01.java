package LFFC01;

import java.util.Scanner;

public class LFFC01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno:LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC01 - Número positivo ou negativo *");
	        System.out.println("***********************************");
	        
	      
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();
	        
	        if (numero > 0) {
	            System.out.println("O número " + numero + " é POSITIVO.");
	        } else if (numero < 0) {
	            System.out.println("O número " + numero + " é NEGATIVO.");
	        } else {
	            System.out.println("O número é ZERO.");
	        }
	        
	        scanner.close();
	}

}
