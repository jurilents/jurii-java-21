package org.obrii.mit.dp2021.jurilents.repositories;

import java.util.List;

import org.obrii.mit.dp2021.jurilents.entities.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "student", path = "student")
public interface IStudentsRepository extends PagingAndSortingRepository<Student, Integer> {
    List<Student> findByName(@Param("name") String name);
}
