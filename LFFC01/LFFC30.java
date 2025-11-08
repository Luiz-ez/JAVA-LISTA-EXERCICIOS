package LFFC01;

import java.util.Scanner;

public class LFFC30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC30 - Menu até escolher sair *");
	        System.out.println("***********************************");


	        Scanner scanner = new Scanner(System.in);
	        int opcao = 0;
	        
	        do {
	            System.out.println("\n--- MENU DE OPÇÕES ---");
	            System.out.println("1. Cadastro");
	            System.out.println("2. Consulta");
	            System.out.println("3. Relatório");
	            System.out.println("4. Sair");
	            System.out.print("Escolha uma opção: ");
	            
	            if (scanner.hasNextInt()) {
	                opcao = scanner.nextInt();
	                scanner.nextLine(); 
	                
	                switch (opcao) {
	                    case 1:
	                        System.out.println("Opção 1 selecionada: Iniciando Cadastro...");
	                        break;
	                    case 2:
	                        System.out.println("Opção 2 selecionada: Iniciando Consulta...");
	                        break;
	                    case 3:
	                        System.out.println("Opção 3 selecionada: Gerando Relatório...");
	                        break;
	                    case 4:
	                        System.out.println("Saindo do sistema. Até logo!");
	                        break;
	                    default:
	                        System.out.println("Opção inválida. Tente novamente.");
	                        break;
	                }
	            } else {
	                System.out.println("Entrada inválida. Digite um número.");
	                scanner.nextLine(); 
	            }
	            
	        } while (opcao != 4);

	        scanner.close();

	}

}
