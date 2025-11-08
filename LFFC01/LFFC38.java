package LFFC01;

import java.util.Scanner;

public class LFFC38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC38 - Confirmar saída com 's' *");
	        System.out.println("***********************************");

	       

	        Scanner scanner = new Scanner(System.in);
	        String sair;
	        
	        do {
	            System.out.println("\n--- APLICAÇÃO EM EXECUÇÃO ---");
	            System.out.println("Realizando alguma tarefa...");
	            
	            System.out.print("Deseja sair da aplicação? (s/n): ");
	            sair = scanner.nextLine().toLowerCase(); 
	            
	        } while (!sair.equals("s"));

	        System.out.println("Aplicação encerrada.");

	        scanner.close();
	}

}
