package exerciciosete;

import java.util.Scanner;

public class ExercicioSete {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		int horasTrabalhadas = entrada.nextInt();
		System.out.println("Informe o valor da hora trabalhada: ");
		double valorHora = entrada.nextDouble();
		int horaMes = 160;
		
		if(horasTrabalhadas > horaMes) {
			double salario = valorHora * horaMes;
			int diferencaHora = horasTrabalhadas - horaMes;
			double horaExtra = diferencaHora * (valorHora + (valorHora * 0.5));
			System.out.println("Seu salário será de R$" + (salario + horaExtra));
		}
		else {
			double salario = valorHora * 160;
			System.out.println("Seu salário será de R$" + salario);
		}
	}
}
