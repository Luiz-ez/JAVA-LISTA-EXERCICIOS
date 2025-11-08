package LFFC01;

import java.util.Scanner;

public class LFFC37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("***********************************");
        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
        System.out.println("* Classe LFFC37 - Soma até o número ser múltiplo de 10 *");
        System.out.println("***********************************");


        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;
        
        System.out.println("Digite números para somar (o loop para ao digitar um múltiplo de 10):");

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero % 10 != 0);

        System.out.println("Foi digitado um múltiplo de 10.");
        System.out.println("A soma total dos números inseridos (incluindo o múltiplo de 10) é: " + soma);

        scanner.close();
	}

}
