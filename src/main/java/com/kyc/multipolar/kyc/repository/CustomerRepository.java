package com.kyc.multipolar.kyc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;
import java.util.List;
import com.kyc.multipolar.kyc.domain.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    Optional<Customer> findByNIK(String nik);

    @Query("{'firstName': {$regex: ?0, $options: 'i'}}")
    List<Customer> findByFirstName(String firstName);
}
