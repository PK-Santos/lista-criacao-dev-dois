package exerciciodois;

import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		
		Scanner preco = new Scanner(System.in);
		
		//solicitando ao cliente o pre�o do produto
		System.out.println("Digite o valor do produto: ");
		double valorProduto = preco.nextDouble();
		
		//aplicando desconto de 10% caso o valor dele seja maior que 1000, se n�o ser� de 5%
		if (valorProduto > 1000) {
		double valorComDesconto = valorProduto * 0.1;
		System.out.println("O valor do produto com desconto �: " + valorComDesconto);
		}
		
		else {
			double valorComDesconto = valorProduto * 0.05;
			System.out.println("O valor do produto com desconto �: " + valorComDesconto);
		}
	}
}
