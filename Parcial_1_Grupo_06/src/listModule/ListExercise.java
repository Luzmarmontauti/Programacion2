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
			
		case 3:
			removeByReferenceLogic();
			break;
			
		case 4:
			clearListLogic();
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
		
		String fullList = "";
		
		for (int i = 0; i < list.size(); i++) {
		    System.out.print(list.get(i) + (i < list.size() - 1 ? ", " : ""));
		}
		
		System.out.println("Contenido de la lista: " + "Lista" + fullList + "Elementos de la lista " + list.size() + "Mostrar si la lista esta vacia " + list.isEmpty());
		System.out.println("Elige alguna de las siguientes opciones: " + 
							"\n 1. Agregar un elemento a la lista" + 
							"\n 2. Remover un elemento por indice" + 
							"\n 3. Remover un elemento por referencia" +
							"\n 4. Limpiar la lista");
		
		currentPhase = scanner.nextInt();
	    scanner.nextLine(); 
	    
	    if (currentPhase == 0) {
	        running = false; 
	    }
	
	}
	
	
	private void addLogic() {
		// TODO Auto-generated method stub
		
		System.out.println("Escribe el elemento lo que deseas agregar a la lista");
		
		String elementoNuevo = scanner.nextLine();
		list.add(elementoNuevo);
		currentPhase = 0;
		
		
	}

	private void removeByIndexLogic() {
		// TODO Auto-generated method stub
		
		System.out.println("Escribe lo que deseas eliminar");
		int elementoEliminado = scanner.nextInt();
		scanner.nextLine();
		
		if (elementoEliminado >= 0 && elementoEliminado < list.size()) {
	        String borrado = list.remove(elementoEliminado); 
	        System.out.println("Has borrado: " + borrado);
	    } else {
	        System.out.println("Esa posición no existe.");
	    }
	    currentPhase = 0; 
		
	}

	
	private void removeByReferenceLogic() {
		System.out.println("Escribe la palabra que necesitas eliminar");
		String palabraEliminada = scanner.nextLine();
		scanner.nextLine();
		
		if (!list.contains(palabraEliminada)) { 
	        System.out.println("La palabra no existe ");
	    } else {
	        System.out.println("Palabra eliminada con exito, la nueva lista es: " + list);
	    }
	    currentPhase = 0; 
		
	}
	

	private void clearListLogic() {
		// TODO Auto-generated method stub
		
		list.clear();
		System.out.println("La lista ahora está vacía.");
		currentPhase = 0;
		
	}


	
	
}
