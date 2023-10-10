package com.kyc.multipolar.kyc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kyc.multipolar.kyc.domain.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
