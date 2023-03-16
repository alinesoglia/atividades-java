package lacos_repeticao;

import java.util.Scanner;

public class lacoWhileEx2 {

	public static void main(String[] args) {

		int idade,sexo,categoria,back=0,frontM=0, mobileH=0, fullstack=0;
		char novoColaborador = 'S';
		
		Scanner leia = new Scanner(System.in);
		
		while(novoColaborador == 'S') {
			System.out.println("\nDigite sua idade:");
			idade = leia.nextInt();
			System.out.println("\nDigite o número referente ao seu sexo\n 1-Masculino\n 2-Feminino\n 3-Outros :");
			sexo = leia.nextInt();
			System.out.println("\nDigite o número referente a sua categoria\n 1-Backend\n 2-Frontend\n 3-Mobile\n 4-FullStack :");
			categoria = leia.nextInt();
			
			if(categoria == 1) {
				back++;
			}
			if(sexo == 2 && categoria == 2){
				frontM++;
			}
			if(sexo == 1 && categoria == 3 && idade > 40) {
				mobileH++;
			}
			if(sexo == 2 && categoria == 4 && idade<30) {
				fullstack++;
			}
				
			System.out.println("\nDeseja cadastrar um(a) novo(a) colaborador(a)? (S/N):");
			novoColaborador = leia.next().charAt(0);
		}
		System.out.println("\nTotal de pessoas desenvolvedoras Backend:  "+back);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend:  "+frontM);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: "+mobileH);
		System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos:  "+fullstack);		

	}

}
