package model.store.repair.budget;

import model.Base_ID;

public class BudgetRequest extends Base_ID{

	
	private String clientID;
	private String employeeID;
	
	private String deviceID;

	public BudgetRequest(String clientID, String employeeID, String deviceID) {
		super();
		this.clientID = clientID;
		this.employeeID = employeeID;
		this.deviceID = deviceID;
	}
	
	
}
