package io.github.companybteamdelta.telegrammgmt;

import io.github.companybteamdelta.telegrammgmt.entities.ChannelSubscription;
import io.github.companybteamdelta.telegrammgmt.entities.ConfigRecord;
import io.github.companybteamdelta.telegrammgmt.entities.User;
import io.github.companybteamdelta.telegrammgmt.repositories.ChannelSubscriptionRepository;
import io.github.companybteamdelta.telegrammgmt.repositories.ConfigsRepository;
import io.github.companybteamdelta.telegrammgmt.repositories.UserRepository;
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

	// todo: remove and replace with real database connection
	@Bean
	public CommandLineRunner demo(ConfigsRepository repository,
								  UserRepository userRepo,
								  ChannelSubscriptionRepository channelSubRepo) {
		return (args) -> {
			repository.save(new ConfigRecord(CONFIG_POLLING_INTERVAL, "3"));
			userRepo.save(new User(1, "token"));
			channelSubRepo.save(
					new ChannelSubscription(1, "", true, false, 88, "t.me/channel1")
			);
		};
	}

}
