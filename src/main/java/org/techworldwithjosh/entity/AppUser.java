package org.techworldwithjosh.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity
@Table(name = "app_user")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subscriber_id", referencedColumnName = "id")
    private Subscriber subscriber;
}
