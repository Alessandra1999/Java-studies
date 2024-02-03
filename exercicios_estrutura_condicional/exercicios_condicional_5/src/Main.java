import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double hotDog = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torrada = 2.00;
		double refrigerante = 1.50;
		
		if (codigo == 1) {
			double precoHotDog = quantidade * hotDog;
			System.out.printf("Valor Total de hot dog é R$ %.2f %n", precoHotDog);
		}
		else if (codigo == 2) {
			double precoXsalada = quantidade * xSalada;
			System.out.printf("Valor Total de xis salada é R$ %.2f %n", precoXsalada);
		}
		else if (codigo == 3) {
			double precoXbacon = quantidade * xBacon;
			System.out.printf("Valor Total de xis bacon é R$ %.2f %n", precoXbacon);
		} 
		else if (codigo == 4) {
			double precoTorrada = quantidade * torrada;
			System.out.printf("Valor Total de torrada simples é R$ %.2f %n", precoTorrada);
		}
		else if (codigo == 5) {
			double precoRefrigerante = quantidade * refrigerante;
			System.out.printf("Valor Total de refrigerante é R$ %.2f %n", precoRefrigerante);
		}
		sc.close();	
		}

}

/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

CÓDIGO		ESPECIFICAÇÃO		PREÇO
1			CACHORRO-QUENTE		R$4,00
2			X-SALADA			R$4,50
3			X-BACON				R$5,00
4			TORRADA SIMPLES		R$2,00
5			REFRIGERANTE		R$1,50

Exemplos:
Entrada: 
3 2 
Saída:
Total: R$ 10.00
Entrada: 
2 3 
Saída:
Total: R$ 13.50 */
