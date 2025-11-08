package LFFC01;

import java.util.Scanner;

public class LFFC34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC34 - Pedir senha até acertar *");
	        System.out.println("***********************************");

	       

	        Scanner scanner = new Scanner(System.in);
	        final int SENHA_CORRETA = 1111;
	        int senhaDigitada;
	        
	        System.out.println("--- Login (do-while) ---");
	       	
	        do {
	            System.out.print("Digite a senha: ");
	            
	            if (scanner.hasNextInt()) {
	                senhaDigitada = scanner.nextInt();
	                
	                if (senhaDigitada != SENHA_CORRETA) {
	                    System.out.println("Senha incorreta. Tente novamente.");
	                }
	            } else {
	                System.out.println("Entrada inválida. Digite apenas números.");
	                scanner.next(); 
	                senhaDigitada = 0;  
	            }
	            
	        } while (senhaDigitada != SENHA_CORRETA);

	        System.out.println("Acesso liberado!");

	        scanner.close();

	}

}
