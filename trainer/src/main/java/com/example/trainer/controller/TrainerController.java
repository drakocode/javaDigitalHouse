package com.example.trainer.controller;

import com.example.trainer.model.Trainer;
import com.example.trainer.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/trainer")
public class TrainerController {

    private final TrainerService trainerService;

    @GetMapping("/index")
    public String welcome(Model model) {
        model.addAttribute("nome", "Felipe");

        return "index";
    }

    @Autowired
    public TrainerController(TrainerService trainerService){
        this.trainerService= trainerService;
    }

    @GetMapping
    public List<Trainer> getTrainer(){
        return trainerService.listTrainer();
    }

}
