package org.techworldwithjosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.techworldwithjosh.entity.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

}
