package com.lab2.mongowebflux;
import com.lab2.mongowebflux.entity.CustomerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CustomerProfileController {
    @Autowired
    private CustomerProfileService customerProfileService ;
    @Autowired
    WebClient webClient;

    @GetMapping("getCustomerProfileById/{id}")
    public Mono<CustomerProfile> getCustomerProfileById (@PathVariable String id){
        return customerProfileService.getCustomerProfileById(id);
    }

    @GetMapping("getCustomerProfileWithLimit/{limit}")
    public Flux<CustomerProfile> getCustomerProfileWithLimit (@PathVariable int limit) {
        return customerProfileService.getCustomerProfileWithLimit(limit);
    }

    @GetMapping("/getRandomParagraphWithMounteBank")
    public Mono<String> getCustomerProfileWithMounteBank(){
        return webClient
                .get()
                .uri("")
                .accept(MediaType.ALL)
                .retrieve()
                .bodyToMono(String.class)
                ;
//        return addressNameDTOFlux();
    }

}
