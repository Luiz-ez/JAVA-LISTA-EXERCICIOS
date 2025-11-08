package LFFC01;

import java.util.Scanner;

public class LFFC29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC29 - Contar dígitos de um número *");
	        System.out.println("***********************************");

	 

	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número inteiro positivo: ");
	        int numeroOriginal = scanner.nextInt();
	        
	        int numero = Math.abs(numeroOriginal); 
	        int contadorDigitos = 0;

	        if (numero == 0) {
	            contadorDigitos = 1;
	        } else {
	            while (numero > 0) {
	                numero /= 10; 
	                contadorDigitos++;
	            }
	        }
	        
	        System.out.println("O número " + numeroOriginal + " tem " + contadorDigitos + " dígitos.");

	        scanner.close();
	}

}
