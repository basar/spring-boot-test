package tr.com.innova.fta.mobil.springboottest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import tr.com.innova.fta.mobil.springboottest.web.controller.BaseController;

/**
 * Created by bcetinkaya
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
        registry.addViewController("/login").setViewName(BaseController.LOGIN_TEMPLATE);
        registry.addViewController("/main").setViewName("main");
    }
}
