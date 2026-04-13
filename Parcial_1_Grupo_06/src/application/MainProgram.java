package application;
import java.util.Scanner;
import listModule.ListExercise;

public class MainProgram {
	
	private boolean running = true;
	
	private Exercise exercise;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainProgram program = new MainProgram();		
		program.run();	

	}
	
	private void run() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		this.exercise = new ListExercise(sc);
		
		while (running) {
			System.out.println("-----Main Program-----");
			System.out.println("Seleccione una de las siguientes opciones: ");
			System.out.println("1.Ejecutar ejercicio actual.");
			System.out.println("0. Terminar el programa");
			System.out.println("Seleccione una opción.");
			
			int selectExercise = sc.nextInt();
			
			if (selectExercise ==0) {
				running = false;
				System.out.println("El programa terminó.");
				}
			
				else {
					System.out.println("Seleccione una opción válida entre 0 y 1");
				}
			} 
			
		sc.close();	
		}
	}
