package com.example.templateController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.repositories.DogRepository;

@Controller
public class Information {

    final private DogRepository dogRepository;

    public Information(final @Autowired DogRepository dogRepository) {
        this.dogRepository = dogRepository;
}
    @GetMapping(path = {"/dogInformation", "/dogInformation.html"})
    public String displayInformation(final Model model) {
        model.addAttribute("dogs", dogRepository.findAll());
        return "dogInformation";
    }
}
