import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1;
		int valor2;
		int soma, subtracao, multiplicacao;
		double divisao;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Esse programa soma, subtrai, multiplica e divide os valores digitados");
		System.out.println("Digite o primeiro valor que deseja somar");
		valor1 = leitor.nextInt();
		System.out.println("Digite o segundo valor que deseja somar");
		valor2 = leitor.nextInt();
		soma = valor1 + valor2;
		System.out.println("A soma foi de: " + soma);

	}

}
