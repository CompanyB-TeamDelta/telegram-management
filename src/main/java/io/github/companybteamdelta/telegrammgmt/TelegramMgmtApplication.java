package io.github.companybteamdelta.telegrammgmt;

import io.github.companybteamdelta.telegrammgmt.entities.ConfigRecord;
import io.github.companybteamdelta.telegrammgmt.repositories.ConfigsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TelegramMgmtApplication {

	public static final String CONFIG_POLLING_INTERVAL = "polling_interval_hours";

	public static void main(String[] args) {
		SpringApplication.run(TelegramMgmtApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ConfigsRepository repository) {
		return (args) -> {
			repository.save(new ConfigRecord(CONFIG_POLLING_INTERVAL, "3"));
		};
	}

}
