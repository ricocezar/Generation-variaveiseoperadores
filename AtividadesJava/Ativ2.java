package PacoteJava;

import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o nome do estudante? ");
		nome = leia.next();
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();

		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = nota1+nota2+nota3/4;
		System.out.println("\nA média do estudante " +nome + " é: " +media);

	}

}
