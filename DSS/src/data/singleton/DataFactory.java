package data.singleton;

import data.DataBaseFacade;
import data.DataBaseFacadeImpl;

public abstract class DataFactory {
	
	public  DataBaseFacadeImpl data;

	public DataFactory(DataBaseFacadeImpl data) {
		super();
		this.data = data;
	}
	
	public DataBaseFacade  getDataBase() {
		return this.data;
	}

}
