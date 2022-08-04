package exercicioseis;

import java.util.Scanner;

public class ExercicioSeis {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Ditite seu salário: ");
		double salario = valor.nextDouble();
		System.out.println("Digite o valor de vendas efetuadas: ");
		double valorVendas = valor.nextDouble();
		
		if(valorVendas <= 1500) {
			double comissao = valorVendas * 0.03;
			System.out.println("Seu salário total será R$" + (salario + comissao));
		}
		
		else {
			double diferenca = valorVendas - 1500;
			double comissao = valorVendas * 0.03 + (diferenca * 0.05);
			System.out.println("Seu salário total será R$" + (salario + comissao));
		}
	}
}
