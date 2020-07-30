package marcel.springframework.springwebapp.bootstrap;

import marcel.springframework.springwebapp.domain.Author;
import marcel.springframework.springwebapp.domain.Book;
import marcel.springframework.springwebapp.domain.Publisher;
import marcel.springframework.springwebapp.repositories.AuthorRepository;
import marcel.springframework.springwebapp.repositories.BookRepository;
import marcel.springframework.springwebapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;


    public BootStrapData(AuthorRepository authorRepository,
                         BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Publisher atica = new Publisher();
        atica.setName("Atica");
        atica.setAddressLIne1("Av. COronel Estevão");
        atica.setCity("Natal");
        atica.setState("RN");
        atica.setZip("11111111");
        publisherRepository.save(atica);
        System.out.println("Publisher COunt: " + publisherRepository.count());

        Author token  = new Author();
        token.setFirstName("jorge");
        token.setLastName("Token");

        Book lord = new Book();
        lord.setTitle("Lord of the Ring");
        lord.setIsbn("4354356456");

        token.getBooks().add(lord);
        lord.getAuthors().add(token);
        lord.setPublisher(atica);
        atica.getbooks().add(lord);
        authorRepository.save(token);
        bookRepository.save(lord);
        publisherRepository.save(atica);

        Book hobbit = new Book();
        hobbit.setTitle("The Hobbit");
        hobbit.setIsbn("5454534534");

        token.getBooks().add(hobbit);
        hobbit.getAuthors().add(token);
        hobbit.setPublisher(atica);
        atica.getbooks().add(hobbit);

        authorRepository.save(token);
        bookRepository.save(hobbit);
        publisherRepository.save(atica);

        System.out.println("Books:" + bookRepository.count());
        System.out.println("Publisher number of books:" + atica.getbooks().size());

    }
}
