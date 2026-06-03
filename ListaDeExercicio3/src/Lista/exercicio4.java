package Lista;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
     
		Scanner entrada = new Scanner (System.in);
		
		int  ent;
		int numero2;
		int soma;
		int produto;
		int diferenca;
		int quociente;
		
		System.out.print("Digite o primeiro número:");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo número:");
		numero2 = entrada.nextInt();
		
		
	quociente = numero1 / numero2;
		
		System.out.printf("A divisao é %d%n", quociente);

	}

}
