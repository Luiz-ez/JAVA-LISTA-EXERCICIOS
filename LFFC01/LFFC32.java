package LFFC01;

import java.util.Scanner;

public class LFFC32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC32 - Tabuada de um número com do-while *");
	        System.out.println("***********************************");
 
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o número para a tabuada: ");
	        int numero = scanner.nextInt();
	        
	        System.out.println("\nTabuada de " + numero + " (do-while):");

	        int i = 1;
	        do {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	            i++;
	        } while (i <= 10);

	        scanner.close();

	}

}
