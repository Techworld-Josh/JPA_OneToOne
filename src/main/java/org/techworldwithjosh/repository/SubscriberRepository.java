package org.techworldwithjosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.techworldwithjosh.entity.Subscriber;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
}
