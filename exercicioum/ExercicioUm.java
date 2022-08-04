package exercicioum;

import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {
		Scanner preco = new Scanner(System.in);
		//solicitando ao cliente o preço do produto
		System.out.println("Digite o valor do produto: ");
		double valorProduto = preco.nextDouble();
		//aplicando desconto de 10%
		double valorComDesconto = valorProduto * 0.1;
		
		System.out.println("O valor do produto com desconto é: " + valorComDesconto);
		
	}
}
