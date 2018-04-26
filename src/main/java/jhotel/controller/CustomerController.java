package jhotel.controller;
import jhotel.Customer;
import org.springframework.web.bind.annotation.*;
import  jhotel.DatabaseCustomer;
import sun.security.util.Password;


@RestController
public class CustomerController {

    @RequestMapping("/")
    public String indexPage(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/newcustomer", method = RequestMethod.POST)
    public Customer newCust(@RequestParam(value = "name") String name, @RequestParam(value = "email") String email,
                            @RequestParam(value = "password") String password) {
        Customer customer = new Customer(name, 2000, 10, 10, email, password);
        try {
            DatabaseCustomer.addCustomer(customer);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }
        ;

        return customer;
    }

    @RequestMapping("/getcustomer/{id}")
    public Customer getCust(@PathVariable int id) {
        Customer customer = DatabaseCustomer.getCustomer(id);
        return customer;
    }

    public Customer loginCust(String email, String password) {
        for (Customer pelanggan : DatabaseCustomer.getCustomerDatabase()) {
            if (pelanggan.getEmail() == email && pelanggan.getPassword() == password) {
                return pelanggan;
            }
        }
        return null;
    }
}
