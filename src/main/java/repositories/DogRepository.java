package repositories;

import entities.dog;
import org.springframework.data.repository.CrudRepository;


public interface DogRepository extends CrudRepository<dog, Long> {
}
