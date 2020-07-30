package marcel.springframework.springwebapp;

import marcel.springframework.springwebapp.domain.Author;
import marcel.springframework.springwebapp.domain.Book;
import marcel.springframework.springwebapp.repositories.AuthorRepository;
import marcel.springframework.springwebapp.repositories.BookRepository;
import marcel.springframework.springwebapp.repositories.PublisherRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebappApplication.class, args);

	}

}
