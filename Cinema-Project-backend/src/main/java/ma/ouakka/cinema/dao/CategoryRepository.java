package ma.ouakka.cinema.dao;

import ma.ouakka.cinema.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface CategoryRepository extends JpaRepository<Categorie, Long> {
}
