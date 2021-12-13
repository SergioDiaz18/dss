package model.client;

import model.Base_ID;

public class Device extends Base_ID{
	
	enum DEVICE_STATES{ registered, delivered }
	
	private String id;
	private String description;
	private String ownerID;
	
	private DEVICE_STATES state;
	
	
	public Device(String id, String description, String owner) {
		super();
		this.id = id;
		this.description = description;
		this.ownerID = owner;
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


	private void setId(String id) {
		this.id = id;
	}


	private void setDescription(String description) {
		this.description = description;
	}


	private void setOwnerId(String owner) {
		this.ownerID = owner;
	}
	
	
	

}
