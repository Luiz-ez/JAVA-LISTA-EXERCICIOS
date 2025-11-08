package LFFC01;

import java.util.Scanner;

public class LFFC08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********************************");
        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
        System.out.println("* Classe LFFC08 - Login simples *");
        System.out.println("***********************************");


        Scanner scanner = new Scanner(System.in);

      
        final String USUARIO_CORRETO = "admin";
        final String SENHA_CORRETA = "12345";

        System.out.println("--- Sistema de Login ---");
        
        System.out.print("Usuário: ");
        String usuarioDigitado = scanner.nextLine();

        System.out.print("Senha: ");
        String senhaDigitada = scanner.nextLine();

        if (usuarioDigitado.equals(USUARIO_CORRETO) && senhaDigitada.equals(SENHA_CORRETA)) {
            System.out.println("Login bem-sucedido! Bem-vindo(a)!");
        } else {
            System.out.println("Falha no login. Usuário ou senha incorretos.");
        }

        scanner.close();

	}

}
