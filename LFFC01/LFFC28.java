package LFFC01;

public class LFFC28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********************************");
	        System.out.println("* Aluno: LUIZ FELIPE FREIRE DA CRUZ - RA 0023623 *");
	        System.out.println("* Classe LFFC28 - Soma dos pares entre 1 e 100 *");
	        System.out.println("***********************************");


	        int soma = 0;
	        int i = 2; 

	        while (i <= 100) {
	            soma += i;
	            i += 2; 
	        }

	        System.out.println("A soma de todos os números pares entre 1 e 100 é: " + soma);

	}

}
