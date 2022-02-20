package br.edu.univas.main;

import br.edu.univas.car.Car;

import java.util.Scanner;

public class StartApp {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		Car car = new Car();
		
		int option;
				
		do {
			
		option = menu();
		
		switch(option) {
		case(1): car.setCar(); break;
		case(2): car.acelerate(); break;
		case(3): car.toBreak(); break;
		case(4): car.showAll(); break;			
		}
		
		}while(option!=9);	
			System.out.println("Fim da corrida!");
	}
	
	public static int menu() {
		System.out.println("\n===Corrida de Carros===\n");
		System.out.println("EScolha umas das opções abaixo:\n");
		System.out.println("1.Cadastrar carro");
		System.out.println("2.Acelerar carro");
		System.out.println("3.Frear carro");
		System.out.println("4.Velocidade atual dos carros");
		System.out.println("5.Posição dos carros na corrida");
		System.out.println("9.Sair");
		return scanner.nextInt();		
		
	}

}
