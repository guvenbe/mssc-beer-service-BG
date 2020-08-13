package guru.springframework.msscbeerservicebg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;

@SpringBootApplication(exclude = ArtemisAutoConfiguration.class)
public class MsscBeerServiceBgApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscBeerServiceBgApplication.class, args);
    }

}
