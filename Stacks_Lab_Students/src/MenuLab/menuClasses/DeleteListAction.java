package MenuLab.menuClasses;

import MenuLab.dataManager.DMComponent;
import MenuLab.ioManagementClasses.IOComponent;

public class DeleteListAction implements Action {

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		IOComponent io = IOComponent.getComponent(); 
		io.output("\nDeleting an existing list of Integer values from the system:\n"); 
		String listName = io.getInput("\nEnter name of the existing list: "); 
		dm.deleteList(listName);
		
	}

}
