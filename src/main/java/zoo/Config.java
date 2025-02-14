package zoo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "zoo")
@Configuration
public class Config {
    @Bean
    public VetClinic vetClinic() {
        return new VetClinic();
    }

    @Bean
    public Zoo zoo(VetClinic vetClinic) {
        return new Zoo(vetClinic);
    }

    @Bean
    public Parser parser(Zoo zoo) {
        return new Parser(zoo);
    }
}