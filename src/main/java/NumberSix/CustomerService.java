package NumberSix;

public class CustomerService {

    //dependency inversion is inverting the design where lower level modules defining interface that higher level modules depend on
    //the idea is to start developing from lower level, database access etc and only then developing higher level
    private final CustomerRepository customerDao;

    public CustomerService(CustomerRepository customerDao) {
        this.customerDao = customerDao;
    }

}
