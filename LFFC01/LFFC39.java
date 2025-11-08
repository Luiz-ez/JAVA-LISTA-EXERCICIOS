package LFFC01;

import java.util.Scanner;

public class LFFC39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC39 - Validar número entre 1 e 5 *");
	        System.out.println("***********************************");

	         

	        Scanner scanner = new Scanner(System.in);
	        int numero;
	        
	        do {
	            System.out.print("Digite um número entre 1 e 5: ");
	            
	            if (scanner.hasNextInt()) {
	                numero = scanner.nextInt();
	                
	                if (numero < 1 || numero > 5) {
	                    System.out.println("Valor fora do intervalo. Tente novamente.");
	                }
	            } else {
	                System.out.println("Entrada inválida. Digite um número inteiro.");
	                scanner.next(); 
	                numero = 0;  
	            }
	            
	        } while (numero < 1 || numero > 5);

	        System.out.println("Número válido digitado: " + numero);

	        scanner.close();
	}

}
