package LFFC01;

import java.util.Scanner;

public class LFFC20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC20 - Números de Fibonacci (n termos) *");
	        System.out.println("***********************************");

	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite quantos termos de Fibonacci deseja (N): ");
	        int n = scanner.nextInt();
	        
	        if (n <= 0) {
	            System.out.println("N deve ser um número positivo.");
	            scanner.close();
	            return;
	        }
	        
	        long a = 0; 
	        long b = 1; 
	        long proximo;
	        
	        System.out.println("\nOs primeiros " + n + " termos da sequência de Fibonacci:");

	        for (int i = 1; i <= n; i++) {
	            System.out.print(a);
	            if (i < n) {
	                System.out.print(", ");
	            }
	            
	            proximo = a + b;
	            a = b;
	            b = proximo;
	        }
	        System.out.println();

	        scanner.close();
	}

}
