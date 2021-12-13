package ui;

import data.DataBaseFacadeImpl;
import data.singleton.DataFactory;
import ui.menu.MainMenu;

public class Main {

	public static void main(String[] args) {
		MainMenu mm= new MainMenu();
		mm.run();
		

	}

}
