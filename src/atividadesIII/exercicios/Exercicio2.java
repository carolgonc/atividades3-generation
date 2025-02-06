package atividadesIII.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int idade = 0;
		int quantidade = 0;
		int quantidade2 = 0;
		
		  while(idade >= 0) {
			System.out.println("Digite um numero: ");
			idade = leia.nextInt();
			
			if (idade <= 21) {
				++quantidade;
			}
			if (idade >=50) {
				++quantidade2;
			}
			}
		  System.out.println("Quantidade de menores de 21: " +quantidade);
		  System.out.println("Quantidade de maiores de 51: "+quantidade2);

}
}
