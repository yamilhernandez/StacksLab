package MenuLab.controlClasses;

import java.util.Stack;

import MenuLab.dataManager.DMComponent;
import MenuLab.menuClasses.MainMenu;
import MenuLab.menuClasses.Menu;
import MenuLab.menuClasses.Option;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DMComponent dm = new DMComponent(); 
		Stack<Menu> mStack = dm.getMenuStack();  
		mStack.push(MainMenu.getMainMenu()); 
		while(!mStack.empty()) {
			Option opt = mStack.peek().activate(); 
			opt.getAction().execute(dm); 
		} 
		
	}
}
