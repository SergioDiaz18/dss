package model.store.repair;

import java.util.Date;

public class RepairProblems {

	private Date date;
	private String comment;

	public RepairProblems(Date date, String comment) {
		super();
		this.date = new Date();
		this.comment = comment;
	}

}
