package business.client;

import model.client.Client;
import model.client.Device;
import model.store.Technician;
import model.store.repair.budget.Budget;

public interface ClientFacade {
	
	
	/**
	 * Register the device, adds properties to each one of them and saves the data
	 * @param client
	 * @param device
	 */
	public void registerDevice(Client client, Device device) ;
	
	/**
	 * Creates a Budget and saves it, adding the client and the budget to the values
	 * @param client
	 * @param device
	 * @return the budget created
	 */
	public Budget registerBudget(Client client, Device device, Technician technician);
	
	/**
	 * Saves the client to the database
	 * @param client
	 */
	public void createClient(String dni, String name, String surname);

}
