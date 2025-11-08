package LFFC01;

import java.util.Scanner;

public class LFFC25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("***********************************");
        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
        System.out.println("* Classe LFFC25 - Tabuada com while *");
        System.out.println("***********************************");
 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número para a tabuada: ");
        int numero = scanner.nextInt();
        
        System.out.println("\nTabuada de " + numero + " (com while):");

        int i = 1;
        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }

        scanner.close();
	}

}
