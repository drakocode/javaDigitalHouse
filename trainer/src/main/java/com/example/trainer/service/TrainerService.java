package com.example.trainer.service;

import com.example.trainer.model.Trainer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerService implements  ITrainerService{

    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(new Trainer("Erik"),new Trainer("Ana"),new Trainer("Leticia"));
    }
}
