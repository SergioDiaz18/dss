package model.store;

import model.Base_ID;

public class Manager extends Base_ID{

	private String userID;
	private String password;

	public String getUserID() {
		return userID;
	}

	public String getPassword() {
		return password;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Manager(String userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}
}
