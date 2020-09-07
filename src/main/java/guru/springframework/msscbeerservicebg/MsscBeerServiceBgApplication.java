package guru.springframework.msscbeerservicebg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsscBeerServiceBgApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscBeerServiceBgApplication.class, args);
    }

}
