package repositories;

import entities.Dog;
import org.springframework.data.repository.CrudRepository;


public interface DogRepository extends CrudRepository<Dog, Long> {
}
