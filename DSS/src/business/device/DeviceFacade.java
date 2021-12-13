package business.device;

import java.util.List;

import model.client.Device;

public interface DeviceFacade {
	
	public void markAbandoned(String id);

	/**
	 * Return de Devices to repair sorted by most urgent
	 * @return
	 */
	public List<Device> getMostUrgentDevices();
	
	
}
