/**
 * 
 */
package com.apps.kaushikservices.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Babita
 *
 */
@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.apps.kaushikservices.configuration" })
public class HibernateConfiguration {
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		System.out.println("factory in");
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] { "com.apps.kaushikservices.domain" });
		sessionFactory.setHibernateProperties(hibernateProperties());
		System.out.println("factory out");
		return sessionFactory;
	}

	@Bean
	public DataSource dataSource() {
		System.out.println("DataSource in");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/kaushikdb");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		System.out.println("DataSource out");
		return dataSource;
	}

	private Properties hibernateProperties() {
		System.out.println("Properties in");
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.format_sql", true);
		System.out.println("Properties out");
		return properties;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory s) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(s);
		return txManager;
	}

}
