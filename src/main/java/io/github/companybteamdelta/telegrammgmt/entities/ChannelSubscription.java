package io.github.companybteamdelta.telegrammgmt.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "channel_subscriptions")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ChannelSubscription {

    @Id
    private int id;

    private String name;

    private boolean active;

    @Column(name = "live_monitored")
    private boolean isLiveMonitored;

    @Column(name = "telegram_channel_id")
    private long tgChannelId;

    @Column(name = "telegram_channel_link")
    private String link;

}
