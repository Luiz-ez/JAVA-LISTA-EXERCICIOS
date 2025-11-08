package LFFC01;

import java.util.Scanner;

public class LFFC02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA0023623 *");
	        System.out.println("* Classe LFFC02 - Par ou ímpar *");
	        System.out.println("***********************************");
	       
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();
	        
	        if (numero % 2 == 0) {
	            System.out.println("O número " + numero + " é PAR.");
	        } else {
	            System.out.println("O número " + numero + " é ÍMPAR.");
	        }
	        
	        scanner.close();
	}

}
