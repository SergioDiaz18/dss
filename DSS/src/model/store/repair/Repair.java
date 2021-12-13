package model.store.repair;

import java.util.Date;
import java.util.List;

import model.Base_ID;

public class Repair extends Base_ID{
	
	enum REPAIR_STATE{ NOT_STARTED, STARTED, WAITING, FINISHED }
	
	private REPAIR_STATE state;
	
	private Date startDate;
	private Date endDate;
	
	private String technicianID;
	
	private List<RepairStep> repairSteps;
	
	private List<RepairProblems> repairProblems;

	public Repair(String technicianID, List<RepairStep> repairSteps, List<RepairProblems> repairProblems) {
		super();
		this.technicianID = technicianID;
		this.repairSteps = repairSteps;
		this.repairProblems = repairProblems;
	}
	
	

}
