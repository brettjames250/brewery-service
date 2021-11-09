package com.springmicroservices.breweryservice.services;

import com.springmicroservices.breweryservice.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerbyId(UUID customerId);

    CustomerDto addNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomerById(UUID customerId);
}
