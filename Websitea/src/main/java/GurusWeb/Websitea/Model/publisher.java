package GurusWeb.Websitea.Model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class publisher {
	private UUID id;
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private Set<Book> book=new HashSet<>();
	
	
	@OneToMany
	@JoinColumn(name = "publisher_id")
	public Set<Book> getBook() {
		return book;
	}
	public void setBook(Set<Book> book) {
		this.book = book;
	}
	public publisher() {
		super();
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "publisher [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + "]";
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
		publisher other = (publisher) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
