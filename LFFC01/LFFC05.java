package LFFC01;

import java.util.Scanner;

public class LFFC05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno:LUIZ FELIPE FREIORE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC05 - Notas e aprovação *");
	        System.out.println("***********************************");


	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a primeira nota (N1): ");
	        double nota1 = scanner.nextDouble();

	        System.out.print("Digite a segunda nota (N2): ");
	        double nota2 = scanner.nextDouble();

	       
	        double media = (nota1 + nota2) / 2.0;

	        System.out.println("Média final: " + media);

	        if (media >= 7.0) {
	            System.out.println("Aluno APROVADO!");
	        } else {
	            System.out.println("Aluno REPROVADO!");
	        }

	        scanner.close();
	}

}
