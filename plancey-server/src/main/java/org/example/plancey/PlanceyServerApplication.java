package org.example.plancey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class PlanceyServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(PlanceyServerApplication.class, args);
	}

}
