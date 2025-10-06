import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		
		double PI =  3.14159;
		double Raio;
		double area;
		
		Raio = sc.nextDouble();
		
		area = PI * (Math.pow(Raio, 2.0));
		
		System.out.printf("area = %.4f%n ", area);
		
		sc.close();
	}

}
