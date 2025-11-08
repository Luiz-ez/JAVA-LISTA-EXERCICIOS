package LFFC01;

import java.util.Scanner;

public class LFFC27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC27 - Quantidade de números ímpares digitados *");
	        System.out.println("***********************************");


	        Scanner scanner = new Scanner(System.in);
	        int contador = 0;
	        int impares = 0;
	        final int TOTAL_NUMEROS = 10;
	        
	        System.out.println("Digite " + TOTAL_NUMEROS + " números:");

	        while (contador < TOTAL_NUMEROS) {
	            System.out.print("Número " + (contador + 1) + ": ");
	            int numero = scanner.nextInt();
	            
	            if (numero % 2 != 0) {
	                impares++;
	            }
	            
	            contador++;
	        }

	        System.out.println("\nDos " + TOTAL_NUMEROS + " números digitados, " + impares + " são ímpares.");

	        scanner.close();

	}

}
