package io.github.companybteamdelta.telegrammgmt.repositories;

import io.github.companybteamdelta.telegrammgmt.entities.ConfigRecord;
import org.springframework.data.repository.CrudRepository;

public interface ConfigsRepository extends CrudRepository<ConfigRecord, String> {

    // ConfigRecord findByName(String name);

}
