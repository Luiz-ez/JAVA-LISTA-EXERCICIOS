package LFFC01;

import java.util.Scanner;

public class LFFC03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno:LUIZ FELIPE FREIRE DA CRUZ  *");
	        System.out.println("* Classe LFFC03 - Maior de dois números *");
	        System.out.println("***********************************");
	
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o primeiro número: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Digite o segundo número: ");
	        int num2 = scanner.nextInt();
	        
	        if (num1 > num2) {
	            System.out.println("O maior número é: " + num1);
	        } else if (num2 > num1) {
	            System.out.println("O maior número é: " + num2);
	        } else {
	            System.out.println("Os números são iguais.");
	        }
	        
	        scanner.close();
	}

}
