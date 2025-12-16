package nevin.learn_spring;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import nevin.learn_spring.data.Foo;

@Slf4j
@Configuration
public class BeanConfiguration {

    // private static final Logger log = LoggerFactory.getLogger(BeanConfiguration.class);

    @Bean
    public Foo fooBean() {
        Foo foo = new Foo();
        log.info("Creating foo bean");

        return foo;
    }
    
}
