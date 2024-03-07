package io.github.companybteamdelta.telegrammgmt.controllers;

import io.github.companybteamdelta.telegrammgmt.dto.ConfigDto;
import io.github.companybteamdelta.telegrammgmt.repositories.ConfigsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    // inject repo
    @Autowired private ConfigsRepository configsRepository;

    @GetMapping("/configuration")
    public ConfigDto getConfiguration() {
        var pollingInterval = configsRepository.findById("polling_interval_hours").get();
        return new ConfigDto(Integer.parseInt(pollingInterval.getRecord_value()));
    }

    @PutMapping("/configuration")
    public void setConfiguration(ConfigDto config) {
        var pollingInterval = configsRepository.findById("polling_interval_hours").get();
        pollingInterval.setRecord_value(String.valueOf(config.pollingIntervalHours()));
        configsRepository.save(pollingInterval);
    }

}
