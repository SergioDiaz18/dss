package ui.menu.manager;

import ui.menu.MainMenu;

public class ManagerMenu extends MainMenu {
//TODO
	private static final String OPTIONS = "Manager Options \n -1 Consult Technicians Performance\n -2 Consult Employees\n -3 Consult Repairs of Technicians\n";

	
	@Override
	public void run() {
		while (!super.option.equals("0")) {
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
