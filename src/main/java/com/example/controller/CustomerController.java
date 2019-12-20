package com.example.controller;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    private CustomerRepository repository;

    private static final boolean reactorClientPresent;

    private static final boolean jettyClientPresent;

    static {
        ClassLoader loader = CustomerController.class.getClassLoader();
        reactorClientPresent = ClassUtils.isPresent("reactor.netty.http.client.HttpClient", loader);
        jettyClientPresent = ClassUtils.isPresent("org.eclipse.jetty.client.HttpClient", loader);
    }

    CustomerController() {
        this.repository = new CustomerRepository();
    }

    @GetMapping("/getAllCustomer")
    public List<Customer> getCustomer() {
        logger.info("Getting the all customer from memory");
        return repository.getCustList();
    }

    @PostMapping("/account/create")
    public String createAccount(@RequestBody Customer customer) {
        logger.info("Creating customer to memory: " + customer.getId() + " -> " + customer.getName());
        repository.addCustomer(customer);
        return "Done -> true";
    }

    @GetMapping("/getRuntimeException")
    private void getRuntime() {
        throw new RuntimeException("Custom Exception");
    }

    @GetMapping("/getCustomerOrder/{customerId}")
    public String getCustomerOrder(@PathVariable String customerId) {
        logger.info("Getting all orders details for customerId: " + customerId);
        RestTemplate restTemplate = new RestTemplate();
        final String url = "http://order"  + ":" + "8081/getOrder/";
//        final String url1 = "http://$ORDER_SERVICE_HOST:$ORDER_SERVICE_PORT/getOrder";
        return restTemplate
            .getForObject(url + customerId, String.class);

    }

    @GetMapping("/getExternalCall")
    public String getExternalCall() {
        logger.info("Getting all orders details for customerId: ");
        RestTemplate restTemplate = new RestTemplate();
        final String url = "http://www.mocky.io/v2/5dedef2e3300004a009842ae";
        String output = restTemplate
            .getForObject(url , String.class);
        System.out.println("Mocky return output is : " + output);
        return output;
    }

    @GetMapping("/getGoogle")
    public String getExternalGoogleCall() {
        logger.info("Getting all orders details for customerId: ");
        RestTemplate restTemplate = new RestTemplate();
        final String url = "http://www.google.com";
        String output = restTemplate
            .getForObject(url , String.class);
        System.out.println("Google return output is : " + output);
        return output;
    }
}
