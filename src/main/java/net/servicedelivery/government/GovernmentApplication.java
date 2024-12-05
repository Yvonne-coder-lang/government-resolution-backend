package net.servicedelivery.government;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("net.servicedelivery.government.model")
@EnableJpaRepositories("net.servicedelivery.government.repository")
public class GovernmentApplication {
    public static void main(String[] args) {
        SpringApplication.run(GovernmentApplication.class, args);
    }
}