package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("spring_introduction")
public class MyConfig {

    @Bean
//    @Scope("prototype")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    @Scope("prototype")
    public Person personBean(){
        return new Person(catBean());
    }
}
