package io.github.companybteamdelta.telegrammgmt.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ConfigDto(

        @JsonProperty("polling_interval_hours")
        int pollingIntervalHours // in hours
) { }
