package model.store.repair.budget;

import model.Base_ID;

public class Budget extends Base_ID{
	
	private String clientID;
	private String deviceID;
	private String tehcnicianID;
	public Budget(String clientID, String deviceID, String tehcnicianID) {
		super();
		this.clientID = clientID;
		this.deviceID = deviceID;
		this.tehcnicianID = tehcnicianID;
	}
	
	

}
