package Lista;

import java.util.Scanner;

public class ListaDeExercicio3  {
    public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
			
			int numero1; 
			int numero2;
			int numero3;
			int Multiplicacao;
			System.out.print("Digite o primeiro número inteiro:");
			numero1 = entrada.nextInt();
			
			System.out.print("Digite o segundo número inteiro:");
			numero2 =entrada.nextInt();
			
			System.out.print("Digite o terceiro número:");
			numero3 = entrada.nextInt();
			
			Multiplicacao = numero1 * numero2 * numero3;
			
			System.out.printf("A soma é %d%n",Multiplicacao);	

	}

}
