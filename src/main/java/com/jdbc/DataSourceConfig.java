package com.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jdbc.dao.StudentDao;
import com.jdbc.dao.StudentDaoImpl;

@Configuration
public class DataSourceConfig {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
	    dataSource.setUsername("root");
	    dataSource.setPassword("MySQL@123");
	    return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		DataSource dataSource =  dataSource();
		return new JdbcTemplate(dataSource());
	}
	
	@Bean
	public StudentDao studentDao() {
		return new StudentDaoImpl();
	}
	

}
