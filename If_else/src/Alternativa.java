import java.util.Scanner;

public class Alternativa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("O desconto é: " + desconto);
		sc.close();
		
	}

}
