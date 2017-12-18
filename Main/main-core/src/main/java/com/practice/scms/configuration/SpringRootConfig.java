package com.practice.scms.configuration;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *  SpringRootconfig class (replaces beans.xml) 
 *   It holds a configuration metadata
 *  
 * @author Vipul-win
 *
 */

@Configuration
@ComponentScan(basePackages= {"com.practice.scms.daoimpl"}) /** An equivalent for Spring XML's <context:component-scan/> Spring will auto-discover and wire the components into Spring container*/
@PropertySource("classpath:application.properties")
public class SpringRootConfig {

	@Value("${jdbc.driver}")
	private String jdbcDriver;
	
	@Value("${jdbc.url}")
	private String jdbcUrl;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	
	@Bean
	public BasicDataSource getDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(jdbcDriver);
		ds.setUrl(jdbcUrl);
		ds.setUsername(username);
		ds.setPassword(password);
		ds.setMaxTotal(2);
		ds.setInitialSize(1);
		ds.setTestOnBorrow(true);
		ds.setValidationQuery("Select 1");
		ds.setDefaultAutoCommit(true);
		return ds;
	}
	
	
}
