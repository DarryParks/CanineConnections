package com.example.restControllers;

import com.example.entities.Dog;
import com.example.entities.DogSkills;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.example.repositories.DogRepository;
import com.example.repositories.DogSkillsRepository;

import java.util.Optional;
@RestController
@CrossOrigin
public class SkillsController {



        final private DogSkillsRepository dogSkillsRepository;
        final private DogRepository dogRepository;

        public SkillsController(DogSkillsRepository dogSkillsRepository, DogRepository dogRepository) {
            this.dogSkillsRepository = dogSkillsRepository;
            this.dogRepository = dogRepository;
        }

        @GetMapping("/api/skills")
        public Iterable<DogSkills> fetchAllSkills() {
            return dogSkillsRepository.findAll();
        }

        @PostMapping("/api/dogs/{dogs_id}/skills")
        public DogSkills createSkills(@PathVariable final long dog_id,
                                      final @RequestBody DogSkills dogSkills) {
            final Optional<Dog> perhapsDog = dogRepository.findById(dog_id);
            perhapsDog.orElseThrow(() ->
                    new ResponseStatusException(HttpStatus.NOT_FOUND, "Cannot find Dog " + dog_id));
            dogSkills.setSkills(perhapsDog.get());
            return dogSkillsRepository.save(dogSkills);
        }

        @GetMapping("/api/skills/{skills_id}")
        public DogSkills fetchSkillsByID(final @PathVariable long skills_id) {
            final Optional<DogSkills> perhapsSkills = dogSkillsRepository.findById(skills_id);
            return perhapsSkills
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cannot find skills " + skills_id));
        }
    }


