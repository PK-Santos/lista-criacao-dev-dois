package exerciciocinco;

import java.util.Scanner;

public class ExercicioCinco {
	public static void main(String[] args) {
		Scanner ano = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = ano.nextInt();
		System.out.println("Digite o ano de seu nascimento: ");
		int anoNasc = ano.nextInt();
		
		if(anoAtual - anoNasc >= 18) {
			System.out.println("Voc� pode votar este ano!");
		}
		
		else {
			System.out.println("Voc� n�o pode votar este ano!");
		}
	}
}
