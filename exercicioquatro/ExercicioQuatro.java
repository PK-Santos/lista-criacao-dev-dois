package exercicioquatro;

import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		Scanner quantidade = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de maçãs que irá comprar: ");
		int quantMaca = quantidade.nextInt();
		
		if(quantMaca < 12) {
			double valorUnit = 1.30;
			System.out.println("O valor total de sua compra foi de R$" + valorUnit * quantMaca);
		}
		
		else {
			double valorUnit = 1.00;
			System.out.println("O valor total de sua compra foi de R$" + valorUnit * quantMaca);
		}
	}
}
