package LFFC01;

import java.util.Scanner;

public class LFFC07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623*");
	        System.out.println("* Classe LFFC07 - Triângulo válido *");
	        System.out.println("***********************************");
 
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o comprimento do Lado A: ");
	        double ladoA = scanner.nextDouble();

	        System.out.print("Digite o comprimento do Lado B: ");
	        double ladoB = scanner.nextDouble();

	        System.out.print("Digite o comprimento do Lado C: ");
	        double ladoC = scanner.nextDouble();
 
	        boolean eTriangulo = (ladoA < ladoB + ladoC) && 
	                             (ladoB < ladoA + ladoC) && 
	                             (ladoC < ladoA + ladoB);

	        if (eTriangulo) {
	            System.out.println("Com as medidas fornecidas, É POSSÍVEL formar um triângulo.");
	        } else {
	            System.out.println("Com as medidas fornecidas, NÃO É POSSÍVEL formar um triângulo.");
	        }

	        scanner.close();

	}

}
