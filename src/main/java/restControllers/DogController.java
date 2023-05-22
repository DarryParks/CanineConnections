package restControllers;

import entities.Dog;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import repositories.DogRepository;

import java.util.Optional;
@RestController
@CrossOrigin
public class DogController {

        final private DogRepository dogRepository;

        public DogController(DogRepository dogRepository) {
            this.dogRepository = dogRepository;
        }

        @GetMapping("/api/dogs")
        public Iterable<Dog> getDogs() {
            return dogRepository.findAll();
        }

        @PostMapping("/api/dogs")
        public Dog postDog(final @RequestBody Dog dog) {
            return dogRepository.save(dog);
        }

        @GetMapping("/api/dogs/{dog_id}")
        public Dog getUserByID(final @PathVariable long dog_id) {
            final Optional<Dog> perhapsDog = dogRepository.findById(dog_id);
            return perhapsDog
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cannot find dog " + dog_id));
        }
    }

