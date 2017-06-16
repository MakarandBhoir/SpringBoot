package org.makarands.repository;

import org.makarands.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
