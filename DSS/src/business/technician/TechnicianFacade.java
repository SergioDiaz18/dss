package business.technician;

import java.util.List;

import model.store.Technician;
import model.store.repair.Repair;

public interface TechnicianFacade {

	public List<Technician> getTechnicians();

	public Technician getTechnician(String id);

	public List<Repair> getRepairsByTechnicianId(String id);

}
