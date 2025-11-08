package LFFC01;

import java.util.Scanner;

public class LFFC09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC09 - Ordem crescente (três números) *");
	        System.out.println("***********************************");



	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número (A): ");
	        int a = scanner.nextInt();

	        System.out.print("Digite o segundo número (B): ");
	        int b = scanner.nextInt();

	        System.out.print("Digite o terceiro número (C): ");
	        int c = scanner.nextInt();

	        System.out.print("Os números em ordem crescente são: ");

	        if (a <= b && a <= c) {
	           
	            if (b <= c) {
	                System.out.println(a + ", " + b + ", " + c);
	            } else {
	                System.out.println(a + ", " + c + ", " + b);
	            }
	        } 
	        else if (b <= a && b <= c) {
	            // B
	            if (a <= c) {
	                System.out.println(b + ", " + a + ", " + c);
	            } else {
	                System.out.println(b + ", " + c + ", " + a);
	            }
	        } 
	        else { 
	           
	            if (a <= b) {
	                System.out.println(c + ", " + a + ", " + b);
	            } else {
	                System.out.println(c + ", " + b + ", " + a);
	            }
	        }

	        scanner.close();
	}

}
