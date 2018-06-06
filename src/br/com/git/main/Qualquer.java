package br.com.git.main;

import java.util.Scanner;

public class Qualquer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String h1 = "Hello People";
		System.out.println("Digite algo: ");
		Scanner sc = new Scanner(System.in);
		String numero = sc.nextLine();
		Integer n = new Integer(numero);
		
		if( n != null && n <= 100){
			System.out.println("Número Passado com sucesso");
		}
		else{
			System.out.println("Erro! Digite um novo numero");
		}
     }

}