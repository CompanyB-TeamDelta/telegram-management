package io.github.companybteamdelta.telegrammgmt.controllers;

import io.github.companybteamdelta.telegrammgmt.dto.ChannelSubscriptionRequestDto;
import io.github.companybteamdelta.telegrammgmt.entities.ChannelSubscription;
import io.github.companybteamdelta.telegrammgmt.repositories.ChannelSubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitoredChannelsController {

    @Autowired
    private ChannelSubscriptionRepository repository;

    @GetMapping("/channel-subscriptions")
    public Iterable<ChannelSubscription> getChannelSubscriptions() {
        return repository.findAll();
    }

    @PostMapping("/channel-subscriptions")
    public ChannelSubscription addChannelSubscription(@RequestBody ChannelSubscriptionRequestDto subscription) {
        var sub = new ChannelSubscription();
        sub.setLink(subscription.getLink());
        sub.setName(subscription.getName());
        sub.setLiveMonitored(subscription.isLiveMonitored());
        sub.setTgChannelId(subscription.getTgChannelId());

        return repository.save(sub);
    }

}
