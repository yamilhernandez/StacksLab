package MenuLab.menuClasses;

import MenuLab.dataManager.DMComponent;
import MenuLab.ioManagementClasses.IOComponent;

public class AddToListAction implements Action {

	@Override
	public void execute(Object arg) {
		IOComponent io = IOComponent.getComponent(); 
		DMComponent dm = (DMComponent) arg; 
		String name = io.getInput("Enter the name of the list to add: ");
		int value = Integer.parseInt(io.getInput("Enter the value to add: ")); 
		dm.addIntToList(name, value); 		
	}

}
