package br.edu.univas.car;


import java.util.Random;
import java.util.Scanner;





public class Car {
	
		Scanner scanner = new Scanner(System.in);
		private int count = 0;
		private String[] car = new String[10];
		private int [] currentSpeed = new int[10];
		
		
		
		public void setCar() {
			if(count<10) {
			System.out.println("Digite o nome de um carro para adicioná-lo: ");
			this.car[count] = scanner.nextLine();
			count++;
			}else {
				System.out.println("A quantidade de carros excedeu o limite!!!");
			}
		}
		
		public void acelerate() {
			Random accelNumber = new Random();			
			for (int i=0; i<count; i++) {	
				int acceleration = accelNumber.nextInt(100);
				currentSpeed[i] += acceleration;
				System.out.println("O carro "+car[i]+" aumentou sua velocidade em "
						+acceleration+" km/h.");
			}			
		}
		
		public void toBreak() {
			Random breakNumber = new Random();
			for (int i=0; i<count; i++) {
				int breaking = breakNumber.nextInt(100);
				currentSpeed[i] -= breaking;
				System.out.println("O carro "+car[i]+" diminuiu sua velocidade em "
						+breaking+" km/h.");
				if(currentSpeed[i]<0) {
					currentSpeed[i] = 0;
				}
			}
		}
		
		public void showAll() {			
			for (int i=0; i<count; i++) {
				System.out.println("O "+car[i]+" tem a velocidade atual de "+currentSpeed[i]+" km/h.");
			}
		}		
}
