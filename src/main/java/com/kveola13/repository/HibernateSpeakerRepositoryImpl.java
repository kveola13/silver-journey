package com.kveola13.repository;

import com.kveola13.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Ola Fredrik");
        speaker.setLastName("Ansnes Kveli");
        speakers.add(speaker);
        return speakers;
    }
}
