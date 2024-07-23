package org.techworldwithjosh.dataloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.techworldwithjosh.entity.AppUser;
import org.techworldwithjosh.entity.Subscriber;
import org.techworldwithjosh.repository.AppUserRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public void run(String... args) throws Exception {

        AppUser user = new AppUser();
        user.setUsername("josh_go");
        user.setEmail("josh.go@hotmail.com");

        Subscriber subscriber = new Subscriber();
        subscriber.setSubscriptionType("Premium");
        subscriber.setSubscriptionStatus("Active");

        user.setSubscriber(subscriber);
        subscriber.setUser(user);

        appUserRepository.save(user);
    }
}
