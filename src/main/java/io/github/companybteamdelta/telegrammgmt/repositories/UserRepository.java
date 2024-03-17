package io.github.companybteamdelta.telegrammgmt.repositories;

import io.github.companybteamdelta.telegrammgmt.entities.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, String> {

    boolean existsByApiKey(String key);

}
