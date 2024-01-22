import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();
	}

}

/* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
Exemplos:
Entrada: 
-10 
Saída: NEGATIVO
Entrada: 
8 
Saída: NAO NEGATIVO
Entrada: 
0 
Saída: NAO NEGATIVO */
