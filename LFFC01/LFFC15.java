package LFFC01;

import java.util.Scanner;

public class LFFC15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC15 - Fatorial de um número *");
	        System.out.println("***********************************");


	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número inteiro não negativo: ");
	        int numero = scanner.nextInt();
	        
	        long fatorial = 1; 
	        
	        if (numero < 0) {
	            System.out.println("Fatorial não é definido para números negativos.");
	        } else if (numero == 0) {
	            System.out.println("O fatorial de 0 é 1.");
	        } else {
	            for (int i = 1; i <= numero; i++) {
	                fatorial *= i;
	            }
	            System.out.println("O fatorial de " + numero + " é: " + fatorial);
	        }

	        scanner.close();
	}

}
