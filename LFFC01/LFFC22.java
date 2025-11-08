package LFFC01;

import java.util.Scanner;

public class LFFC22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("***********************************");
	        System.out.println("* Aluno:LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC22 - Soma de números até digitar zero *");
	        System.out.println("***********************************");
 

	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        int numero;
	        
	        System.out.println("Digite números para somar (digite 0 para parar):");

	        do {
	            System.out.print("Número: ");
	            numero = scanner.nextInt();
	            soma += numero;
	        } while (numero != 0);

	        System.out.println("A soma total é: " + soma);

	        scanner.close();
	}

}
