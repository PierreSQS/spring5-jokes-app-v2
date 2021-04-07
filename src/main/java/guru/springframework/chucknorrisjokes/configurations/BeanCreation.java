package guru.springframework.chucknorrisjokes.configurations;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCreation {

    @Bean
    public ChuckNorrisQuotes createNorrisQuote() {
        return new ChuckNorrisQuotes();
    }
}
