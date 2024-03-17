package io.github.companybteamdelta.telegrammgmt.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class ChannelSubscriptionRequestDto {

    String name;

    @JsonProperty("live_monitored")
    boolean isLiveMonitored;

    boolean live_monitored;

    String link;

    @JsonProperty("telegram_channel_id")
    long tgChannelId;

}
