package business.budgetrequests;

import java.util.List;

import model.store.repair.budget.BudgetRequest;

public interface BudgetRequestFacade {
	
	/**
	 * Access BudgetRequests and returns them sorted by oldness
	 * @return
	 */
	public List<BudgetRequest> getRequestsByOldness();
	
	
	

}
