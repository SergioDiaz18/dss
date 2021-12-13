package ui.menu;

import java.io.IOException;

public interface Menu {
	
	public void run();

	
	public void display(String txt);
	
	public void readScreen() throws IOException;
}
