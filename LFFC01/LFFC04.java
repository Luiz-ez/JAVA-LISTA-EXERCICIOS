package LFFC01;

import java.util.Scanner;

public class LFFC04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno:LUIZ FELIPE FREIRE DA CRUZ  - RA 0023623 *");
	        System.out.println("* Classe LFFC04 - Pode votar? *");
	        System.out.println("***********************************");


	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a idade da pessoa: ");
	        int idade = scanner.nextInt();

	        if (idade >= 16) {
	            System.out.println("Com " + idade + " anos, a pessoa PODE votar.");
	        } else {
	            System.out.println("Com " + idade + " anos, a pessoa NÃO PODE votar.");
	        }

	        scanner.close();

	}

}
