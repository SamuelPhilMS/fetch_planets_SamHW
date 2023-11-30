package org.launchcode.codingevents.Data;

import org.launchcode.codingevents.Models.SiteUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<SiteUser, Integer> {

    SiteUser findByUsername(String username);

}
