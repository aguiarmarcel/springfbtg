package marcel.springframework.springwebapp.repositories;

import marcel.springframework.springwebapp.domain.Book;
import marcel.springframework.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

import java.util.concurrent.Flow;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
