package tr.com.innova.fta.mobil.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Arrays;

/**
 * Created by bcetinkaya
 */


@ComponentScan
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories
@EnableTransactionManagement
@PropertySource("classpath:/META-INF/config/application.properties")
public class SpringBootTestApplication {


    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBootTestApplication.class);

        /**
        final String[] beanNames = applicationContext.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (final String beanName : beanNames) {
            System.out.println(beanName);
        }**/

    }


}
