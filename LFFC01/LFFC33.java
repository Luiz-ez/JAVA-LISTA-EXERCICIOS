package LFFC01;

import java.util.Scanner;

public class LFFC33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC33 - Menu com opção de sair *");
	        System.out.println("***********************************");
 

	        Scanner scanner = new Scanner(System.in);
	        int opcao;
	        
	        do {
	            System.out.println("\n--- MENU ---");
	            System.out.println("1 - Mensagem");
	            System.out.println("2 - Sair");
	            System.out.print("Escolha uma opção: ");
	            
	            opcao = scanner.nextInt();
	            
	            switch (opcao) {
	                case 1:
	                    System.out.println("Você escolheu a mensagem!");
	                    break;
	                case 2:
	                    System.out.println("Saindo do programa. Até logo!");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	                    break;
	            }
	        } while (opcao != 2);

	        scanner.close();
	}

}
