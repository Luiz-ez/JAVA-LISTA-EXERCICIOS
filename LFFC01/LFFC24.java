package LFFC01;

import java.util.Scanner;

public class LFFC24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC24 - Verificar se um número é positivo *");
	        System.out.println("***********************************");
 

	        Scanner scanner = new Scanner(System.in);
	        int numero;
	        
	        do {
	            System.out.print("Digite um número positivo: ");
	            numero = scanner.nextInt();
	            
	            if (numero <= 0) {
	                System.out.println("O número deve ser positivo. Tente novamente.");
	            }
	        } while (numero <= 0);

	        System.out.println("Número positivo digitado com sucesso: " + numero);

	        scanner.close();

	}

}
