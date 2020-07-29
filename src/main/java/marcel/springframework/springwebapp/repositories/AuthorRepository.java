package marcel.springframework.springwebapp.repositories;

import marcel.springframework.springwebapp.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Annotation;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
