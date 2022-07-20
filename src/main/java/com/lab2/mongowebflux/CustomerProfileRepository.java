package com.lab2.mongowebflux;

import com.lab2.mongowebflux.entity.CustomerProfile;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CustomerProfileRepository extends ReactiveMongoRepository<CustomerProfile,String> {
    @Query("{ 'customerId' : ?0 }") // 0..1--> Mono
    Mono<CustomerProfile> findCustomerProfileById(String id);

}
