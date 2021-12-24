package model.client;

import model.Base_ID;

public class Device extends Base_ID{
	
	enum DEVICE_STATES{ registered, delivered, abandoned }
	
	private String id;
	private String description;
	private String ownerID;
	private String dataRepair;
	
	private DEVICE_STATES state;
	
	
	public Device(String id, String description, String owner, String dataRepair) {
		super();
		this.id = id;
		this.description = description;
		this.ownerID = owner;
		this.dataRepair = dataRepair;
	}


	public String getId() {
		return id;
	}


	public String getDescription() {
		return description;
	}


	public String getOwner() {
		return ownerID;
	}
	
	public String dataRepair() {
		return dataRepair;
	}
	
	private void setId(String id) {
		this.id = id;
	}


	private void setDescription(String description) {
		this.description = description;
	}


	private void setOwnerId(String owner) {
		this.ownerID = owner;
	}
	
	public void markAbandoned() {
		state = DEVICE_STATES.abandoned;
	}
	
	

}
