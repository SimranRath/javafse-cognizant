package exercise11;

public class Main {
public static void main(String[] args) {
   CustomerRepository customerRepository = new CustomerRepositoryImpl();
   CustomerService customerService = new CustomerService(customerRepository);

   Customer customer = customerService.findCustomerById(1);
   System.out.println("Customer ID: " + customer.getId());
   System.out.println("Customer Name: " + customer.getName());
}
}
