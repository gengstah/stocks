package org.cognoscenti.stocks.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring3.SpringTemplateEngine;
import org.thymeleaf.spring3.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.cognoscenti.stocks.web", excludeFilters = { @Filter(Configuration.class) })
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/contact/").setViewName("contact");
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/fonts/**").addResourceLocations("/fonts/");
		registry.addResourceHandler("/images/**").addResourceLocations("/images/");
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Bean
	public ServletContextTemplateResolver templateResolver() {
		
		ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
		templateResolver.setPrefix("/WEB-INF/templates/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("HTML5");
		templateResolver.setOrder(1);
		
		return templateResolver;
	}
	
	@Bean
	public SpringTemplateEngine templateEngine() {
		
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateResolver());
		
		return templateEngine;
	}
	
	@Bean
	public ThymeleafViewResolver thymeleafViewResolver() {
		
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(templateEngine());
		viewResolver.setOrder(1);
		return viewResolver;
	}
	
	@Bean
    public MessageSource messageSource() {
		
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        messageSource.setCacheSeconds(15);
        
        return messageSource;
    }
	
}