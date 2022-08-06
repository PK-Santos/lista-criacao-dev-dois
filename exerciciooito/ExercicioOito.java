package exerciciooito;

import java.util.Scanner;

public class ExercicioOito {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		double valorProduto = entrada.nextDouble();
		System.out.println("Digite a quantidade comprada do produto: ");
		int quantProduto = entrada.nextInt();
		double valorTotal = valorProduto * quantProduto;
		
		if(valorProduto > 300) {
			double desconto = valorTotal * 0.10;
			System.out.println("O valor total à pagar é R$" + (valorTotal - desconto));
		}
		if (quantProduto > 5) {
			double desconto = valorTotal * 0.05;
			System.out.println("O valor total à pagar é R$" + (valorTotal - desconto));
		}
			
	}
}
