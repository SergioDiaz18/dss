package model;


import java.util.UUID;
public class Base_ID {

	
	protected String id;

	public Base_ID() {
		super();
		this.id = UUID.randomUUID().toString();
	}
	
	public boolean isID(String id) {
		return this.id.equals(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Base_ID other = (Base_ID) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
}
