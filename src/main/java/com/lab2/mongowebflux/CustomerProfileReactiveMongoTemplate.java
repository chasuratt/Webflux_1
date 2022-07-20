package com.lab2.mongowebflux;

import com.lab2.mongowebflux.entity.CustomerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class CustomerProfileReactiveMongoTemplate {
    @Autowired
    private ReactiveMongoTemplate reactiveMongoTemplate;
    public Flux<CustomerProfile> getCustomerProfileWithLimit(Integer limit){ // 0..N --> Flux
        Query query = new Query();
        query.limit(limit);
        return reactiveMongoTemplate.find(query, CustomerProfile.class);
    }

}
