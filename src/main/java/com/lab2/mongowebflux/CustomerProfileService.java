package com.lab2.mongowebflux;

import com.lab2.mongowebflux.entity.CustomerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class CustomerProfileService {
    @Autowired CustomerProfileRepository customerProfileRepository ;
    @Autowired CustomerProfileReactiveMongoTemplate customerProfilereactiveMongoTemplate;
    public Mono<CustomerProfile> getCustomerProfileById(String id) {
        return customerProfileRepository.findCustomerProfileById(id);
    }

    public Flux<CustomerProfile> getCustomerProfileWithLimit(int limit){
        return customerProfilereactiveMongoTemplate.getCustomerProfileWithLimit(limit);
    }



}
