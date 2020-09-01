package GurusWeb.Websitea.Repository;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

import GurusWeb.Websitea.Model.Author;

public interface AuthorRepository extends CrudRepository<Author, UUID>{

}
