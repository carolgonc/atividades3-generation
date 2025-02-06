package atividadesIII.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numeroUsuario;
		boolean achei = false;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numeroUsuario = leia.nextInt();
		
		
		for(int numeroFor = 0; numeroFor < 10; numeroFor++ ) {
			if(numeroUsuario == numero[numeroFor]) {
				System.out.println("Posição é: " + (numeroFor + 1));
				achei = true;
		}
		
		}
		if(achei == false) {
			System.out.println("Não foi encontrado!");

	}

}
}
