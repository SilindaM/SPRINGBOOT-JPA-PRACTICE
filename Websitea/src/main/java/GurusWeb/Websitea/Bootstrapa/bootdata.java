package GurusWeb.Websitea.Bootstrapa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import GurusWeb.Websitea.Model.Author;
import GurusWeb.Websitea.Model.Book;
import GurusWeb.Websitea.Repository.AuthorRepository;
import GurusWeb.Websitea.Repository.BookRepository;


@Component
public class bootdata implements CommandLineRunner{
	private final AuthorRepository author;
	private final BookRepository book;
	

	public bootdata(AuthorRepository author, BookRepository book) {
		this.author = author;
		this.book = book;
	}



	@Override
	public void run(String... args) throws Exception {
		Author eri=new Author("MDuduzi","Silinda");
		Book nath=new Book("Phile nathi","124545");
		eri.getBook().add(nath);
		nath.getAuthor().add(eri);
		
		
		author.save(eri);
		book.save(nath);
		
		
	}

	
}
