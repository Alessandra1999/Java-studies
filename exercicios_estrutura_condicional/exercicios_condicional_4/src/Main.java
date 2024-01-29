import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		if (horaInicial == horaFinal) {
			System.out.println("O jogo durou 24 horas");
		} 
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
			System.out.println("O jogo durou " + duracao + " hora(s)");
		}
		else if (horaInicial > horaFinal) {
			duracao = 24 - horaInicial + horaFinal;
			System.out.println("O jogo durou " + duracao + " hora(s)");
		}
		sc.close();
	}

}

/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
Exemplos:
Entrada: 
16 2 
Saída: O JOGO DUROU 10 HORA(S)
Entrada: 
0 0 
Saída: O JOGO DUROU 24 HORA(S)
Entrada: 
2 16 
Saída: O JOGO DUROU 14 HORA(S) */
