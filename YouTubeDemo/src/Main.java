
public class Main {

	public static void main(String[] args) {
		CreditManager creditManager=new CreditManager();// instance creation
        creditManager.Calculate();
        Customer customer=new Customer();
        customer.Id=10;
        //customer.FirstName="Emrah";
        //customer.LastName="CETIN";
        customer.nationalIdentity="trtrtr";
        //customer.setFirtname("Emrah");
        //System.out.println(customer.getFirtname());
        //CustomerManager customerManager =new CustomerManager();
        //customerManager.Save(customer); encapsulation olan ile çağrılır
        //CustomerManager customerManager =new CustomerManager( customer);
        //customerManager.Save();
        Company company=new Company();
        company.TexNumber="105g";
        company.Company="arçelik";
        CustomerManager customerManager2=new CustomerManager(new Person(),new MilitaryCreditManager());
         //Customer c1= new Customer();
         //Customer c2=new Person();
         //Customer c3=new Company();
         customerManager2.GiveCredit();
        //Person person=new Person();
       // person.FirstName="xx";
         CustomerManager customerManager3=new CustomerManager(new Person(),new TeacherCreditManager());
         customerManager3.GiveCredit();
}
}