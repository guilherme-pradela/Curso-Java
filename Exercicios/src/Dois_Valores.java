import java.util.Scanner;

public class Dois_Valores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B, Soma;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		Soma = A + B;
		
		System.out.println("A Soma é " + Soma);
		
		sc.close();
	}

}
