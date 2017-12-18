package com.practice.scms.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * This class is used provide 
 * @author Vipul-win
 *
 */

@Configuration
@ComponentScan(basePackages= {"com.practice"})
@EnableWebMvc
public class SpringWebConfig extends WebMvcConfigurerAdapter{
	/**
	 * This addResourceHandlers serves static resourse 
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		super.addResourceHandlers(registry);
	}
	/**
	 * ViewResolver view resolvers enable you to render models in a 
	 * browser without tying you to a specific view technology like JSP
	 * @return
	 */
	@Bean
	public ViewResolver viewresolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		
		vr.setViewClass(JstlView.class);
		vr.setPrefix("/WEB-INF/view/");
		vr.setSuffix(".jsp");
		
		return vr;
		
	}

}
