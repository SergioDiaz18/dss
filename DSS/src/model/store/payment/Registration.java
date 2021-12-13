package model.store.payment;

import model.Base_ID;
import model.store.Employee;

public class Registration extends Base_ID{

	private String deviceID;
	private String clientID;
	
	private Employee employee;

	public Registration(String deviceID, String clientID, Employee employee) {
		super();
		this.deviceID = deviceID;
		this.clientID = clientID;
		this.employee = employee;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public String getClientID() {
		return clientID;
	}

	public Employee getEmployee() {
		return employee;
	}

	

}
