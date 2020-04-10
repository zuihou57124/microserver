package com.springclouddemo.providertickt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderTicktApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTicktApplication.class, args);
    }

}
