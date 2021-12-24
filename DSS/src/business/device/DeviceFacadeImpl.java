package business.device;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.client.Device;


public class DeviceFacadeImpl implements DeviceFacade {
	
	private Map<String,Device> devices;
	
	@Override
	public void markAbandoned(String id) {
		// TODO Auto-generated method stub
		Device d = this.devices.get(id);
		d.markAbandoned();
	}

	@Override
	public List<Device> getMostUrgentDevices() {
		// TODO Auto-generated method stub
		List<Device> listUrgent = new ArrayList<Device>();
		
		for (String id: devices.keySet()) {
			
			// date =10-02-2021
	        String[] values = devices.get(id).dataRepair().split("-");
	        int day = Integer.parseInt(values[0]);
	        int month = Integer.parseInt(values[1]);
	        int year = Integer.parseInt(values[2]);
	        
	        // guardar las fechas y coger la mas urgemte
	        
				
	        listUrgent.add(devices.get(id));
		}
        return listUrgent;
	}

}
