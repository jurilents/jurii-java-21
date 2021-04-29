package org.obrii.mit.dp2021.jurilents.repositories;

import org.obrii.mit.dp2021.jurilents.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> { }
