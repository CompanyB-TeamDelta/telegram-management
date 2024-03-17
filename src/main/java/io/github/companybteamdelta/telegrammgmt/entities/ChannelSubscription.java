package io.github.companybteamdelta.telegrammgmt.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "channel_subscriptions")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ChannelSubscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Setter
    private String name;

    private boolean active = true;

    @Column(name = "live_monitored")
    @Setter
    private boolean isLiveMonitored;

    @Column(name = "telegram_channel_id")
    @Setter
    private long tgChannelId;

    @Column(name = "telegram_channel_link")
    @Setter
    private String link;

}
