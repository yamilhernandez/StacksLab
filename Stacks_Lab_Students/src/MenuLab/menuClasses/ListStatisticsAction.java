package MenuLab.menuClasses;

import MenuLab.dataManager.DMComponent;

public class ListStatisticsAction implements Action {

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		dm.getMenuStack().push(ListStatisticsMenu.getListStatisticsMenu()); 
	}

}
