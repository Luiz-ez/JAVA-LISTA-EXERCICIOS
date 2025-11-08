package LFFC01;

import java.util.Scanner;

public class LFFC35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC35 - Número positivo obrigatório *");
	        System.out.println("***********************************");

	      

	        Scanner scanner = new Scanner(System.in);
	        double numero;
	        
	        do {
	            System.out.print("Digite um número positivo (maior que 0): ");
	            
	            if (scanner.hasNextDouble()) {
	                numero = scanner.nextDouble();
	                
	                if (numero <= 0) {
	                    System.out.println("Número inválido. Deve ser maior que zero.");
	                }
	            } else {
	                System.out.println("Entrada inválida. Digite um número.");
	                scanner.next(); 
	                numero = -1;  
	            }
	            
	        } while (numero <= 0);

	        System.out.println("Número positivo aceito: " + numero);

	        scanner.close();

	}

}
