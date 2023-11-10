package org.launchcode.codingevents.Data;

import org.launchcode.codingevents.Models.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Chris Bay
 */
@Repository
public interface TagRepository extends CrudRepository<Tag, Integer> {
}