package GurusWeb.Websitea.Repository;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import GurusWeb.Websitea.Model.Book;

public interface BookRepository extends CrudRepository<Book, UUID> {

}
