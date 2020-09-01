package GurusWeb.Websitea.Model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	

	private  UUID id;
	private String title;
	private String isbn;
	@ManyToOne
	private publisher publisha;
	@ManyToMany
	@JoinTable(name="author_book",joinColumns = @JoinColumn(name = "book_id"),inverseJoinColumns=@JoinColumn(name = "author_id"))
	private Set<Author> author=new HashSet<>();
	public Book(String title, String isbn) {
		this.title = title;
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Set<Author> getAuthor() {
		return author;
	}
	public void setAuthor(Set<Author> author) {
		this.author = author;
	}
	
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public publisher getPublisha() {
		return publisha;
	}
	public void setPublisha(publisher publisha) {
		this.publisha = publisha;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + ", author=" + author + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
