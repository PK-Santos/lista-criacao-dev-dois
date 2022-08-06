package exercicionove;

import java.util.Scanner;

public class ExercicioNove {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu salário: ");
		double salario = entrada.nextDouble();
		System.out.println("Digite quantos filhos você tem: ");
		int filhos = entrada.nextInt();
		
		if(salario < 1000 && filhos > 2) {
			double salarioFinal = salario + (salario * 0.10);
			System.out.println("Seu salário será de R$" + salarioFinal);
		}
		else {
			System.out.println("Seu salário será de R$" + salario);
		}
	}
}
