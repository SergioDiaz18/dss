package data;

import java.util.List;

import model.client.Client;
import model.client.Device;
import model.store.Employee;
import model.store.Manager;
import model.store.Technician;
import model.store.payment.Delivery;
import model.store.payment.Payment;
import model.store.payment.Registration;
import model.store.repair.ExpressRepair;
import model.store.repair.Repair;
import model.store.repair.budget.Budget;
import model.store.repair.budget.BudgetRequest;
import model.store.repair.workplan.Workplan;

public interface DataBaseFacade {
	
	
	public void add(Client client);
	public void remove(Client client);
	public List<Client> findAllClients();
	public Client findOneClient(String id);
	public Client update(String id, Client client);
	
	public void add(Device device);
	public void remove(Device device);
	public List<Device> findAllDevices();
	public Device findOneDevice(String id);
	public Device update(String id, Device device);
	
	public void add(Budget budget);
	public void remove(Budget budget);
	public List<Budget> findAllBudgets();
	public Budget findOneBudget(String id);
	public Budget update(String id, Budget budget);
	
	public void add(Repair repair);
	public void remove(Repair repair);
	public List<Repair> findAllRepairs();
	public Repair findOneRepair(String id);
	public Repair update(String id, Repair repair);
	
	public void add(Workplan workplan);
	public void remove(Workplan workplan);
	public List<Workplan> findAllWorkplans();
	public Workplan findOneWorkplan(String id);
	public Workplan update(String id, Workplan workplan);
	
	public void add(Employee employee);
	public void remove(Employee employee);
	public List<Employee> findAllEmployees();
	public Employee findOneEmployee(String id);
	public Employee update(String id, Employee employee);
	
	public void add(Manager manager);
	public void remove(Manager manager);
	public List<Manager> findAllManagers();
	public Manager findOneManager(String id);
	public Manager update(String id, Manager manager);
	
	public void add(Technician technician);
	public void remove(Technician technician);
	public List<Technician> findAllTechnicians();
	public Technician findOneTechnician(String id);
	public Technician update(String id, Technician technician);
	
	public void add(Delivery delivery);
	public void remove(Delivery delivery);
	public List<Delivery> findAllDeliverys();
	public Delivery findOneDelivery(String id);
	public Delivery update(String id, Delivery delivery);
	
	public void add(Payment payment);
	public void remove(Payment payment);
	public List<Payment> findAllPayments();
	public Payment findOnePayment(String id);
	public Payment update(String id, Payment payment);
	
	public void add(ExpressRepair expressRepair);
	public void remove(ExpressRepair expressRepair);
	public List<ExpressRepair> findAllExpressRepairs();
	public ExpressRepair findOneExpressRepair(String id);
	public ExpressRepair update(String id, ExpressRepair expressRepair);
	
	public void add(BudgetRequest repairRequest);
	public void remove(BudgetRequest repairRequest);
	public List<BudgetRequest> findAllBudgetRequest();
	public BudgetRequest findOneBudgetRequest(String id);
	public BudgetRequest update(String id, BudgetRequest repairRequest);
	
	public void add(Registration registration);
	public void remove(Registration registration);
	public List<Registration> findAllRegistrations();
	public Registration findRegistrations(String id);
	public Registration update(String id, Registration registration);
	
	
	
	

}
