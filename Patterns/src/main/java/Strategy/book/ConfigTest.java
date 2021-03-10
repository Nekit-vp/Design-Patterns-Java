package Strategy.book;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigTest {

    @Bean
    public Strategy.book.MallardDuck mallardDuck(){
        return new Strategy.book.MallardDuck();
    }

    @Bean
    public Strategy.book.ModelDuck modelDuck(){
        return new ModelDuck();
    }
}
