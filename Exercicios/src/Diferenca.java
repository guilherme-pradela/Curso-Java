import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, Diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		Diferenca = A * B - C * D;
		
		System.out.println("A diferenca é " + Diferenca);
		
		sc.close();

	}

}
