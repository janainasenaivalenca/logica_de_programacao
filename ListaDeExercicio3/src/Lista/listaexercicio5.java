package Lista;

import java.util.Scanner;

public class listaexercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int raio;

		
		System.out.print("Digite o raio:");
		raio =entrada.nextInt();
		
		System.out.printf("Diametro: %d", 2* raio);
		System.out.printf("circunfêrencia:%f",2* Math.PI * raio);
		System.out.printf("Área do círculo:%f",Math.PI*raio* raio);
		
		
	}

}
