package io.yadnyesh.sbghall.repository;

import io.yadnyesh.sbghall.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
