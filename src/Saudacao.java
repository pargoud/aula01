import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String nome;
		System.out.println("Por favor,insira seu nome");
		nome = leitor.next();
		System.out.println("Olá " + nome + " tudo bem?");
		leitor.close();
		
		

	}

}
