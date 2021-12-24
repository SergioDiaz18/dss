package business.employee;

import java.util.ArrayList;
import java.util.List;


import model.store.Employee;
import model.store.payment.Delivery;
import model.store.payment.Registration;

public class EmployeeFacadeImpl implements EmployeeFacade {
	
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		List<Employee> listE = new ArrayList<Employee>();

        
        return listE;
	}

	@Override
	public List<Delivery> getDeliveryByEmployeeId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Registration> getRegistrationByEmployeeId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
