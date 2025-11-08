package LFFC01;

import java.util.Scanner;

public class LFFC19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC19 - Verificar se um número é primo *");
	        System.out.println("***********************************");

	        

	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();
	        
	        if (numero <= 1) {
	            System.out.println("O número " + numero + " não é primo.");
	            scanner.close();
	            return;
	        }

	        boolean ePrimo = true;

	      
	        for (int i = 2; i < numero; i++) {
	            if (numero % i == 0) {
	                ePrimo = false;
	                break; 
	            }
	        }

	        if (ePrimo) {
	            System.out.println("O número " + numero + " É primo.");
	        } else {
	            System.out.println("O número " + numero + " NÃO é primo.");
	        }

	        scanner.close();

	}

}
