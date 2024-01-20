import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int soma = a + b;
		
		System.out.println("O primeiro número digitado foi: " + a);
		System.out.println("O segundo número digitado foi: " + b);
		System.out.println("A soma dos dois números é: " + soma);
		
		sc.close();
	}

}

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
Exemplos:
Entrada: 
10
30
Saída:
SOMA = 40
Entrada: 
-30
10
Saída:
SOMA = -20
Entrada: 
0
0
Saída:
SOMA = 0

CORREÇÃO: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
*/
