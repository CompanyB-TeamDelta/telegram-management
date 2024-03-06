package io.github.companybteamdelta.telegrammgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class}) // todo: remove after setting up the database
public class TelegramMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelegramMgmtApplication.class, args);
	}

}
