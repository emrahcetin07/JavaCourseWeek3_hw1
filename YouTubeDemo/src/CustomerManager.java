
public class CustomerManager {
	private Customer _customer;
	private ICreditManager _creditManager;
	//public void Save(Customer customer) //encapsulatin
	//{
		//System.out.println("kredi verildi");	

	//}
	public CustomerManager(Customer customer,ICreditManager creditManager) {
		_customer=customer;
		_creditManager=creditManager;
		
	}
	public void Save() {
		//System.out.println("müşteri kaydedildi" + _customer.FirstName);
		
	}
	public void Delete()
	{
		//System.out.println("müşteri silindi" + _customer.FirstName);
		
	}
	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("kredi verildi");
	}
	

}
