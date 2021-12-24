package business.client;

import java.util.Map;

import model.client.Client;
import model.client.Device;
import model.store.Technician;
import model.store.repair.budget.Budget;

public class ClientFacadeImpl implements ClientFacade {
	
	private Map<String,Device> devices;
	
	@Override
	public void registerDevice(Client client, Device device) {
		// TODO Auto-generated method stub
		this.devices.put(device.getId(), device);
	}

	@Override
	public Budget registerBudget(Client client, Device device, Technician technician) {
		// TODO Auto-generated method stub
		String clientDNI = client.getDni();
		String deviceId = device.getId();
		String technicianId = technician.getUserID();
		
		Budget b = new Budget(clientDNI, deviceId, technicianId);
		
		return b;
	}

	@Override
	public void createClient(String dni, String name, String surname) {
		// TODO Auto-generated method stub
		Client c = new Client(dni, name, surname);
		
	}

}
