package com.kveola13.service;

import com.kveola13.model.Speaker;
import com.kveola13.repository.HibernateSpeakerRepositoryImpl;
import com.kveola13.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
