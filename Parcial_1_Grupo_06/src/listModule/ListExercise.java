package listModule;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import application.Exercise;

public class ListExercise extends Exercise {
	private int currentPhase = 0;
	private boolean firstTime = true;
	
	private List<String>list;
	

	
	public ListExercise(Scanner scanner) {
		super(scanner);
		
		//list = new ArrayList<>();
		list = new LinkedList<>();
	}
	
	@Override
	protected void exerciseLogic() {
		switch(currentPhase) {
		case 0:
			menuLogic();
			break;
			
		case 1:
			addLogic();
			break;
		
		case 2:
			removeByIndexLogic();
			break;
			
		default:
			System.out.println("Fin de las opciones");
		}
	}
	
	private void menuLogic() {
		if(firstTime) {
			System.out.println("Bienvenidoooooooooooooooooooooooooooo");
			firstTime = false;
		}
		else {
			System.out.println("Estado actual");
		}
		
		
	}


	private void removeByIndexLogic() {
		// TODO Auto-generated method stub
		
	}


	private void addLogic() {
		// TODO Auto-generated method stub
		
	}


	
	
}
