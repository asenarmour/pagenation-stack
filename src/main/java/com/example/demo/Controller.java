package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value="/get/customers/{page}")
    public List<Customers> getCustomersPaginated(@PathVariable("page") int page)
    {
        Pageable pageableObject= PageRequest.of(page, 2, Sort.by("cnum").ascending());
        Page<Customers> pageObject = customerRepository.findAll(pageableObject);
        return pageObject.getContent();
    }
}