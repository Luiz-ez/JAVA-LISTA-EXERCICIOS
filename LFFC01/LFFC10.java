package LFFC01;

import java.util.Scanner;

public class LFFC10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIE DA CRUZ - RA 023623 *");
	        System.out.println("* Classe LSB10 - Ano bissexto *");
	        System.out.println("***********************************");


	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um ano (ex: 2024): ");
	        int ano = scanner.nextInt();

	        boolean eBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

	        if (eBissexto) {
	            System.out.println("O ano " + ano + " É bissexto.");
	        } else {
	            System.out.println("O ano " + ano + " NÃO é bissexto.");
	        }

	        scanner.close();
	}

}
