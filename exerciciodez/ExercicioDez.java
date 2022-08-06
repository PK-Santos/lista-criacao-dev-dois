package exerciciodez;

import java.util.Scanner;

public class ExercicioDez {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade em KG de maçã comprada: ");
		int quantMaca = entrada.nextInt();
		System.out.println("Digite a quantidade em KG de morango comprada: ");
		int quantMorango = entrada.nextInt();
		double desconto = 0;
		double precoMaca = 0;
		double precoMorango = 0;
		double valorTotal = (quantMaca * precoMaca) + (quantMorango * precoMorango);
		if(quantMaca > 5) {
			precoMaca = 1.80;			
		}
		else {
			precoMaca = 2.50;
		}
		if(quantMorango > 5) {
			precoMorango = 1.50;
		}
		else {
			precoMorango = 2.20;	
		}
		valorTotal = (quantMaca * precoMaca) + (quantMorango * precoMorango);
		if (quantMaca > 8 || quantMorango > 8 || valorTotal > 25) {
			desconto = valorTotal * 0.10;
		}
		valorTotal = (quantMaca * precoMaca) + (quantMorango * precoMorango) - desconto;
		System.out.println("O valor total da compra é de R$" + valorTotal);
	}
}
