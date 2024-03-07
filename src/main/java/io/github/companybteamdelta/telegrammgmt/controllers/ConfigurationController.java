package io.github.companybteamdelta.telegrammgmt.controllers;

import io.github.companybteamdelta.telegrammgmt.dto.ConfigDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    @GetMapping("/configuration")
    public ConfigDto getConfiguration() {
        return new ConfigDto(2);
    }

}
