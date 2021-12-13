package business.expressrepair;

import model.client.Client;
import model.client.Device;
import model.store.repair.ExpressRepair;

public interface ExpressRepairFacade {
	
	public void registerExpressService(Client client, Device device);
	
	public void markAsFinished(ExpressRepair expressRepair);

}
