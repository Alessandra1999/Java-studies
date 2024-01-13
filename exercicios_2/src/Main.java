import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * (raio * raio);
		
		System.out.printf("A área é = %.4f %n", area);
		sc.close();
	}

}
