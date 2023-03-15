package lacos_e_condicionais;

import java.util.Scanner;

public class laco_ex3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme seu nome: ");
		nome=leia.nextLine();
		System.out.println("\nInforme sua idade: ");
		idade=leia.nextInt();
		System.out.println("\nÉ sua primeira doação? Digite 'true' para Sim e 'false' para Não ");
		primeiraDoacao=leia.nextBoolean() ;
		
	
		if((idade>=18&&idade<=59)&&(primeiraDoacao==true || primeiraDoacao==false)) {
			System.out.println(nome + " está apto(a) para doar sangue!");
		}else if((idade>=60&&idade<=69)&& primeiraDoacao==true) {
			System.out.println(nome + " não está apto(a) para doar sangue!");
		}else if((idade>=60&&idade<=69)&& primeiraDoacao==false){
			System.out.println(nome + " está apto(a) para doar sangue!");
		}else {
			System.out.println(nome + " não está apto(a) para doar sangue!");
		}

	}

}
