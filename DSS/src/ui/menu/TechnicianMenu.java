package ui.menu;

import ui.menu.manager.ManagerMenu;

public class TechnicianMenu extends MainMenu {
	//TODO
private static final String OPTIONS = "Technician Options \n TODO";

	
	@Override
	public void run() {
		while (super.option != "0") {
			display(OPTIONS);
			readScreen();
			switch (super.option) {
			case "1": {
				ManagerMenu mm = new ManagerMenu();
				mm.run();
			}

			}
		}
	}

	
	

}
