package business.employee;

import java.util.List;

import model.store.Employee;
import model.store.payment.Delivery;
import model.store.payment.Registration;

public interface EmployeeFacade {
	
	public List<Employee> getEmployees();
	
	public List<Delivery> getDeliveryByEmployeeId(String id);
	
	public List<Registration> getRegistrationByEmployeeId(String id);
	

}
