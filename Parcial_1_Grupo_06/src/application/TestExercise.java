package application;
import java.util.Scanner;


public class TestExercise extends Exercise {
	
	public TestExercise(Scanner scanner) {
		super(scanner);
	}

	@override
	
	protected void exerciseLogic() {
		System.out.println("¡Bienvenido al TP del grupo 06!");
		System.out.println("Volver al menú principal, marca 0");
		int opcion = scanner.nextInt();
		if (opcion!=0) {
			System.out.println("Ingresa una opción válida");
			running = false;
		}
	
	}
	
	
	
}
