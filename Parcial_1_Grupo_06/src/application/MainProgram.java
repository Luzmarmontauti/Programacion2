package application;

import java.util.Scanner;
import listModule.ListExercise; // Importamos tu clase de listas

public class MainProgram {
    
    private boolean running = true;
    private Exercise exercise; // Esta es la referencia a la clase padre
    
    public static void main(String[] args) {
        MainProgram program = new MainProgram();        
        program.run();    
    }
    
    private void run() {
        Scanner sc = new Scanner(System.in);
        
        // Inicializamos el ejercicio. Le pasamos 'sc' (el Scanner de este Main).
        // Esto se hace una sola vez para que el objeto esté listo.
        this.exercise = new ListExercise(sc);
        
        while (running) {
            System.out.println("\n----- Main Program -----");
            System.out.println("1. Ejecutar ejercicio de Listas (ListExercise)");
            System.out.println("0. Terminar el programa");
            System.out.print("Seleccione una opción: ");
            
            // Usamos nextInt para capturar el número
            int selectExercise = sc.nextInt();
            sc.nextLine(); // LIMPIEZA DE BUFFER (Siempre después de nextInt)
            
            if (selectExercise == 1) {
                // Aquí llamamos al método run() que heredó de Exercise
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