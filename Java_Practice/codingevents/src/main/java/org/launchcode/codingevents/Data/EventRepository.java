package org.launchcode.codingevents.Data;

import org.launchcode.codingevents.Models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

}
