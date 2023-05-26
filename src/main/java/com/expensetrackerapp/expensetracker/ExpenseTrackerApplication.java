package com.expensetrackerapp.expensetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@SpringBootApplication
public class ExpenseTrackerApplication {

	public static void main(String[] args) {
		Properties properties = new Properties();
		try (FileInputStream fileInputStream = new FileInputStream("src/.env")) {
			properties.load(fileInputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Retrieve the username and password
		String dbUsername = properties.getProperty("DB_USERNAME");
		String dbPassword = properties.getProperty("DB_PASSWORD");

		// Set the properties using the retrieved values
		System.setProperty("spring.datasource.username", dbUsername);
		System.setProperty("spring.datasource.password", dbPassword);
		SpringApplication.run(ExpenseTrackerApplication.class, args);
	}

}
