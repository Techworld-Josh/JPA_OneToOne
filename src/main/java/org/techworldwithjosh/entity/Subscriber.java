package org.techworldwithjosh.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity
@Table(name = "subscriber")
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subscriptionType;
    private String subscriptionStatus;

    @OneToOne(mappedBy = "subscriber")
    private AppUser user;

}
