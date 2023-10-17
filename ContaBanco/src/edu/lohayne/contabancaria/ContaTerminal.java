package edu.lohayne.contabancaria;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o numero da conta:");
		numero = scan.nextInt();
		scan.nextLine();
		System.out.println("Insira a agencia:");
		agencia = scan.nextLine();
		System.out.println("Insira seu nome:");
		nomeCliente = scan.nextLine();
		System.out.println("Insira saldo");
		saldo = scan.nextDouble();
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
	}

}
