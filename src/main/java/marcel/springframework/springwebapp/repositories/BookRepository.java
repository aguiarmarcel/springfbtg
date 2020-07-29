package marcel.springframework.springwebapp.repositories;

import marcel.springframework.springwebapp.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Annotation;

public interface BookRepository extends CrudRepository<Book, Long> {

}
