package org.obrii.mit.dp2021.jurilents.repositories;

import org.obrii.mit.dp2021.jurilents.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> { }
