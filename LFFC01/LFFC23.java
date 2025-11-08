package LFFC01;

import java.util.Scanner;

public class LFFC23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********************************");
        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
        System.out.println("* Classe LFFC23 - Senha correta *");
        System.out.println("***********************************");

      

        Scanner scanner = new Scanner(System.in);
        final String SENHA_CORRETA = "java123";
        String senhaDigitada = "";
        
        System.out.println("--- Login ---");

        while (!senhaDigitada.equals(SENHA_CORRETA)) {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
           
            if (!senhaDigitada.equals(SENHA_CORRETA)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        System.out.println("Acesso concedido! Bem-vindo.");

        scanner.close();
	}

}
