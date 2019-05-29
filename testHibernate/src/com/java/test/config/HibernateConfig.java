package com.java.test.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.java.test.config"})
public class HibernateConfig {

	
	static{
		System.out.println("HibernateConfig Initialized");
	}
	
	@Bean
	public LocalSessionFactoryBean localSessionFactroryBean()
	{
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(datasource());
		sessionFactory.setHibernateProperties(hibernateProperties());
		sessionFactory.setPackagesToScan("com.java.test.entity");
		return sessionFactory;
	}
	
	@Bean
	public DataSource datasource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://10.10.11.181:5432/awlcollections");
		ds.setUsername("psqadmin");
		ds.setPassword("atos@1234");
		return ds;
	}
	
	private Properties hibernateProperties()
	{
		Properties prop = new Properties();
		prop.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		prop.put("hibernate.show_sql", "true");
		prop.put("hibernate.format_sql", "true");
		/*prop.put("hibernate.hbm2ddl.auto", "update");*/
		prop.put("hibernate.cache.use_second_level_cache", "false");
/*		prop.put("hibernate.cache.region.factory_class", value);
		prop.put("hibernate.cache.use_query_cache", value);*/
		return prop;
	}
	
	@Bean
	public HibernateTransactionManager hibernateTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager manager = new HibernateTransactionManager();
		manager.setSessionFactory(sessionFactory);
		return manager;
	}
	
}
