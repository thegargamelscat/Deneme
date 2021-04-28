package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.id = 1;
		individualCustomer.firstName = "Recep";
		individualCustomer.lastName = "Azman";
		individualCustomer.nationalIdentity = "123456789012";
		individualCustomer.customerNumber = "26372813";
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.id = 1;
		corporateCustomer.companyName = "Güllüoðlu Baklava";
		corporateCustomer.taxNumber = "1425361625";
		corporateCustomer.customerNumber = "263737271";
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		CustomerManager customerManager = new CustomerManager();
		customerManager.addMultiple(customers);
				
	}

}
