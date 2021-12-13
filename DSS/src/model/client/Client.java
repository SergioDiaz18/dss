package model.client;

import model.Base_ID;

public class Client extends Base_ID{

	
	private String dni;
	private String name;
	private String surname;
	
	
	
	public Client(String dni, String name, String surname) {
		super();
		this.dni = dni;
		this.name = name;
		this.surname = surname;
	}
	
	
	public String getDni() {
		return dni;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	private void setDni(String dni) {
		this.dni = dni;
	}
	private void setName(String name) {
		this.name = name;
	}
	private void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}
