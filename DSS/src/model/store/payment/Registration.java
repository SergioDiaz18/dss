package model.store.payment;

import model.Base_ID;
import model.store.Employee;

public class Registration extends Base_ID{

	private String deviceID;
	private String clientDNI;
	
	private Employee employee;

	public Registration(String deviceID, String clientDNI, Employee employee) {
		super();
		this.deviceID = deviceID;
		this.clientDNI = clientDNI;
		this.employee = employee;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public String clientDNI() {
		return clientDNI;
	}

	public Employee getEmployee() {
		return employee;
	}

	

}
