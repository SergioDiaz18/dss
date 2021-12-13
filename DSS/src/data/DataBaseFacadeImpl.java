package data;

import java.util.ArrayList;
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

public class DataBaseFacadeImpl implements DataBaseFacade {

	private List<Client> clients;

	private List<Device> devices;

	private List<Budget> budgets;

	private List<Repair> repairs;

	private List<Workplan> workplans;

	private List<Employee> employees;

	private List<Manager> managers;

	private List<Technician> technicians;
	
	private List<Registration> registrations;

	private List<Delivery> deliverys;

	private List<Payment> payments;

	private List<ExpressRepair> expressRepairs;
	
	private List<BudgetRequest> budgetRequests;
	
	

	@Override
	public void add(Client client) {
		clients.add(client);

	}

	@Override
	public void remove(Client client) {
		clients.remove(client);
	}

	@Override
	public List<Client> findAllClients() {
		return new ArrayList<>(clients);
	}

	@Override
	public Client findOneClient(String id) {

		for (Client client : clients) {
			if (client.isID(id)) {
				return client;
			}
		}
		return null;
	}

	@Override
	public Client update(String id, Client client) {
		for (Client clientAux : clients) {
			if (clientAux.isID(id)) {
				remove(clientAux);
				add(client);
				return client;
			}
		}
		return null;
	}

	@Override
	public void add(Device device) {
		devices.add(device);

	}

	@Override
	public void remove(Device device) {
		devices.remove(device);
	}

	@Override
	public List<Device> findAllDevices() {
		return new ArrayList<>(devices);
	}

	@Override
	public Device findOneDevice(String id) {
		for (Device device : devices) {
			if (device.isID(id)) {
				return device;
			}
		}
		return null;
	}

	@Override
	public Device update(String id, Device device) {
		for (Device deviceAux : devices) {
			if (deviceAux.isID(id)) {
				remove(deviceAux);
				add(device);
				return device;
			}
		}
		return null;
	}

	@Override
	public void add(Budget budget) {
		budgets.add(budget);
	}

	@Override
	public void remove(Budget budget) {
		budgets.remove(budget);
	}

	@Override
	public List<Budget> findAllBudgets() {
		return new ArrayList<>(budgets);
	}

	@Override
	public Budget findOneBudget(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Budget update(String id, Budget budget) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Repair repair) {
		repairs.add(repair);

	}

	@Override
	public void remove(Repair repair) {
		repairs.remove(repair);

	}

	@Override
	public List<Repair> findAllRepairs() {
		return new ArrayList<>(repairs);
	}

	@Override
	public Repair findOneRepair(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Repair update(String id, Repair repair) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Workplan workplan) {
		workplans.add(workplan);

	}

	@Override
	public void remove(Workplan workplan) {
		workplans.remove(workplan);

	}

	@Override
	public List<Workplan> findAllWorkplans() {
		return new ArrayList<>(workplans);
	}

	@Override
	public Workplan findOneWorkplan(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Workplan update(String id, Workplan workplan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Employee employee) {
		employees.add(employee);

	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);

	}

	@Override
	public List<Employee> findAllEmployees() {
		return new ArrayList<>(employees);
	}

	@Override
	public Employee findOneEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Manager manager) {
		managers.add(manager);

	}

	@Override
	public void remove(Manager manager) {
		managers.remove(manager);

	}

	@Override
	public List<Manager> findAllManagers() {
		return new ArrayList<>(managers);
	}

	@Override
	public Manager findOneManager(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manager update(String id, Manager manager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Technician technician) {
		technicians.add(technician);

	}

	@Override
	public void remove(Technician technician) {
		technicians.remove(technician);

	}

	@Override
	public List<Technician> findAllTechnicians() {
		return new ArrayList<>(technicians);
	}

	@Override
	public Technician findOneTechnician(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Technician update(String id, Technician technician) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Delivery delivery) {
		deliverys.add(delivery);

	}

	@Override
	public void remove(Delivery delivery) {
		deliverys.remove(delivery);

	}

	@Override
	public List<Delivery> findAllDeliverys() {
		return new ArrayList<>(deliverys);
	}

	@Override
	public Delivery findOneDelivery(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Delivery update(String id, Delivery delivery) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void add(Registration registration) {
		registrations.add(registration);
		
	}

	@Override
	public void remove(Registration registration) {
		registrations.remove(registration);
		
	}

	@Override
	public List<Registration> findAllRegistrations() {
		return new ArrayList<>(registrations);
	}

	@Override
	public Registration findRegistrations(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Registration update(String id, Registration registration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Payment payment) {
		payments.add(payment);

	}

	@Override
	public void remove(Payment payment) {
		payments.remove(payment);

	}

	@Override
	public List<Payment> findAllPayments() {
		return new ArrayList<>(payments);
	}

	@Override
	public Payment findOnePayment(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment update(String id, Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(ExpressRepair expressRepair) {
		expressRepairs.add(expressRepair);

	}

	@Override
	public void remove(ExpressRepair expressRepair) {
		expressRepairs.remove(expressRepair);

	}

	@Override
	public List<ExpressRepair> findAllExpressRepairs() {
		return new ArrayList<>(expressRepairs);
	}

	@Override
	public ExpressRepair findOneExpressRepair(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExpressRepair update(String id, ExpressRepair expressRepair) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(BudgetRequest repairRequest) {
		budgetRequests.add(repairRequest);
		
	}

	@Override
	public void remove(BudgetRequest repairRequest) {
		budgetRequests.remove(repairRequest);
		
	}

	@Override
	public List<BudgetRequest> findAllBudgetRequest() {
		return new ArrayList<>(budgetRequests);
	}

	@Override
	public BudgetRequest findOneBudgetRequest(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BudgetRequest update(String id, BudgetRequest repairRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
