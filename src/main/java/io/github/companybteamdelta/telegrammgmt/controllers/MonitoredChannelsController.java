package io.github.companybteamdelta.telegrammgmt.controllers;

import io.github.companybteamdelta.telegrammgmt.entities.ChannelSubscription;
import io.github.companybteamdelta.telegrammgmt.repositories.ChannelSubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitoredChannelsController {

    @Autowired
    private ChannelSubscriptionRepository repository;

    @GetMapping("/channel-subscriptions")
    public Iterable<ChannelSubscription> getChannelSubscriptions() {
        return repository.findAll();
    }

}
