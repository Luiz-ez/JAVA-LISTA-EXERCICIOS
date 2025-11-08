package LFFC01;

import java.util.Scanner;

public class LFFC40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC40 - Ler números e mostrar o maior *");
	        System.out.println("***********************************");

	    

	        Scanner scanner = new Scanner(System.in);
	        int numero;
	        int maior = Integer.MIN_VALUE; 
	        
	        System.out.println("Digite números positivos (digite um negativo para parar):");

	        do {
	            System.out.print("Número: ");
	            numero = scanner.nextInt();
	            
	            if (numero >= 0) {
	                if (numero > maior) {
	                    maior = numero;
	                }
	            }
	            
	        } while (numero >= 0);

	        if (maior == Integer.MIN_VALUE) {
	            System.out.println("Nenhum número positivo foi digitado.");
	        } else {
	            System.out.println("O maior número positivo digitado foi: " + maior);
	        }

	        scanner.close();

	}

}
