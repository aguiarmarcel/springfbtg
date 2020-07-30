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

        Book lord = new Book();
        Book hobbit = new Book();

        lord.setTitle("Lord of the Ring");
        lord.setIsbn("4354356456");

        hobbit.setTitle("The Hobbit");
        hobbit.setIsbn("5454534534");

        Author token  = new Author();

        token.setFirstName("jorge");
        token.setLastName("Token");

        Publisher atica = new Publisher();

        atica.setName("Atica");
        atica.setAddressLIne1("Av. COronel Estevão");
        atica.setCity("Natal");
        atica.setState("RN");
        atica.setZip("11111111");

        atica.getPu_books().add(hobbit);
        atica.getPu_books().add(lord);

        token.getBooks().add(hobbit);
        token.getBooks().add(lord);
        hobbit.getAuthors().add(token);
        lord.getAuthors().add(token);

        authorRepository.save(token);
        bookRepository.save(hobbit);
        bookRepository.save(lord);
        publisherRepository.save(atica);


        System.out.println("Test:");
        System.out.println("Authors:" + authorRepository.count());
        System.out.println("Books:" + bookRepository.count());
        System.out.println("Publishers:" + publisherRepository.count());

    }
}
