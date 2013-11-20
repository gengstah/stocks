package org.cognoscenti.stocks.config;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.cognoscenti.stocks.dao.StockHistorySummaryDataAccessObject;
import org.cognoscenti.stocks.dao.impl.StockHistorySummaryDataAccessObjectImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.AbstractEntityManagerFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.persistenceunit.DefaultPersistenceUnitManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:jdbc-prod.properties")
public class OrmConfig {
	
	@Inject	private Environment env;
	
	@Bean
	public DriverManagerDataSource dataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(env.getProperty("jdbc.url"));
		dataSource.setUsername(env.getProperty("jdbc.username"));
		dataSource.setPassword(env.getProperty("jdbc.password"));
		dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		
		return dataSource;
	}
	
	@Bean
	public DefaultPersistenceUnitManager persistenceUnitManager() {
		
		DefaultPersistenceUnitManager persistenceUnitManager = new DefaultPersistenceUnitManager();
		persistenceUnitManager.setPersistenceXmlLocation("classpath:META-INF/persistence.xml");
		
		Map<String, DataSource> dataSources = new HashMap<String, DataSource>();
		dataSources.put("localDataSource", dataSource());
		persistenceUnitManager.setDataSources(dataSources);
		persistenceUnitManager.setDefaultDataSource(dataSource());
		
		return persistenceUnitManager;
	}
	
	@Bean
	public AbstractEntityManagerFactoryBean entityManagerFactory() {
		
		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactory.setPersistenceUnitManager(persistenceUnitManager());
		entityManagerFactory.setLoadTimeWeaver(new InstrumentationLoadTimeWeaver());
		
		return entityManagerFactory;
	}
	
	@Bean
	public PlatformTransactionManager transactionManager() {

		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		
		return transactionManager;
	}
	
	@Bean
	public StockHistorySummaryDataAccessObject stockHistorySummaryDataAccessObject() {
		return new StockHistorySummaryDataAccessObjectImpl();
	}
	
}