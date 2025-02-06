package atividadesIII.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		 int numero = 0;
		 int quantidade = 0;
		 int soma = 0;
		
		 
		 do {
			 System.out.println("Digite um numero: ");
			 numero = leia.nextInt();
			 quantidade++;
			 
			 if (numero >= 0) {
				 soma += numero;
			 }
			 
			
		 }while(numero !=0);
		 
		 System.out.println("Numeros positivos: " +soma);

	}

}
