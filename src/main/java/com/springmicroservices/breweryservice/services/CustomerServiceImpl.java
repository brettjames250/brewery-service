package com.springmicroservices.breweryservice.services;

import com.springmicroservices.breweryservice.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDto getCustomerbyId(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Brett")
                .build();
    }

    @Override
    public CustomerDto addNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // TODO Implement this
        log.debug("editting customer: " + customerId);
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        // TODO Implement this
        log.debug("deleting customer: " + customerId);
    }
}
