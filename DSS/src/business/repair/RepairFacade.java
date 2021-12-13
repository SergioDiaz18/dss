package business.repair;

import model.client.Client;
import model.client.Device;
import model.store.repair.Repair;
import model.store.repair.RepairStep;

public interface RepairFacade {

	public void calculateBudget(String id);
	
	public void sendBudgetToClient(String id, Client client);
	
	public void concludeBudget(String id);
	
	public void registerDelivery(Client client, Device device);
	
	public void registerPayment(Client client);
	
	public void archiveBudget(String id);
	
	public void registerStep(Repair repair, RepairStep repairStep);
	
	public void markAsFinished(Repair repair);
	
	public void markAsWaiting(Repair repair);
	
	
}
