package MenuLab.menuClasses;

import MenuLab.dataManager.DMComponent;

public class ShowListsAction implements Action {

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		dm.showListsNames(); 
	}

}
