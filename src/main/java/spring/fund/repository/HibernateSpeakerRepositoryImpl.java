package spring.fund.repository;

import spring.fund.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Tom");
        speaker.setLastName("Delone");

        speakers.add(speaker);

        return speakers;

    }
}
