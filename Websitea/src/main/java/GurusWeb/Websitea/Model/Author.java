package GurusWeb.Websitea.Model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;


@Entity
public class Author {
	private  UUID id;
	private String name;
	private String surname;
	@ManyToMany(mappedBy ="authors")
	private Set<Book> book=new HashSet<>();
	
	
	
	public Author(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	
	public Author() {
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Set<Book> getBook() {
		return book;
	}
	public void setBook(Set<Book> book) {
		this.book = book;
	}

	
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", surname=" + surname + ", book=" + book + "]";
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
		Author other = (Author) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}	
