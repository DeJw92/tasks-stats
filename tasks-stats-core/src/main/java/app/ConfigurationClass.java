package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Dawid Pawlak.
 */

@Configuration
public class ConfigurationClass {

    @Bean
    public RestTemplate get() {
        return new RestTemplate();
    }

}
