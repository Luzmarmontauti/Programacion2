package application;

import java.util.Scanner;
import listModule.ListExercise; // Importamos tu clase de listas

public class MainProgram {
    
    private boolean running = true;
    private Exercise exercise; 
    
    public static void main(String[] args) {
        MainProgram program = new MainProgram();        
        program.run();    
    }
    
    private void run() {
        Scanner sc = new Scanner(System.in);
        
        
        this.exercise = new ListExercise(sc);
        
        while (running) {
            System.out.println("\n----- Main Program -----");
            System.out.println("1. Ejecutar ejercicio de Listas (ListExercise)");
            System.out.println("0. Terminar el programa");
            System.out.print("Seleccione una opción: ");
            
            
            int selectExercise = sc.nextInt();
            sc.nextLine(); 
            
            if (selectExercise == 1) {
                
                exercise.run(); 
            }
            else if (selectExercise == 0) {
                running = false;
                System.out.println("Saliendo del programa principal...");
            } 
            else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        } 
        
        sc.close();    
        System.out.println("Programa finalizado con éxito.");
    }
}