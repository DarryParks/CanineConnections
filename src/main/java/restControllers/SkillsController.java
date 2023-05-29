package restControllers;

import entities.Dog;
import entities.Skills;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import repositories.DogRepository;
import repositories.SkillsRepository;

import java.util.Optional;
@RestController
@CrossOrigin
public class SkillsController {



        final private SkillsRepository skillsRepository;
        final private DogRepository dogRepository;

        public SkillsController(SkillsRepository skillsRepository, DogRepository dogRepository) {
            this.skillsRepository = skillsRepository;
            this.dogRepository = dogRepository;
        }

        @GetMapping("/api/skills")
        public Iterable<Skills> fetchAllSkills() {
            return skillsRepository.findAll();
        }

        @PostMapping("/api/dogs/{dogs_id}/skills")
        public Skills createSkills(@PathVariable final long dog_id,
                                 final @RequestBody Skills skills) {
            final Optional<Dog> perhapsDog = dogRepository.findById(dog_id);
            perhapsDog.orElseThrow(() ->
                    new ResponseStatusException(HttpStatus.NOT_FOUND, "Cannot find Dog " + dog_id));
            skills.setSkills(perhapsDog.get());
            return skillsRepository.save(skills);
        }

        @GetMapping("/api/skills/{skills_id}")
        public Skills fetchSkillsByID(final @PathVariable long skills_id) {
            final Optional<Skills> perhapsSkills = skillsRepository.findById(skills_id);
            return perhapsSkills
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cannot find skills " + skills_id));
        }
    }


