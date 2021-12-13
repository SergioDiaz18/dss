package ui.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ui.menu.manager.ManagerMenu;

public class MainMenu implements Menu {

	private static final String OPTIONS = "Options \n -1 Manager Menu\n -2 Technician Menu \n -3 Employee Menu\n";

	protected String option = "";

	private ManagerMenu managerMenu = new ManagerMenu();

	@Override
	public void display(String txt) {
		System.out.print(txt);

	}

	@Override
	public void run() {
		while (this.option != "0") {
			display(OPTIONS);
			readScreen();
			switch (this.option) {
			case "1": {
				managerMenu.run();
			}

			}
		}

	}

	@Override
	public void readScreen() {
		display("Option:");
		while (option == "") {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			try {
				this.option = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
