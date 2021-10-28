package spring.fund.service;

import spring.fund.model.Speaker;
import spring.fund.repository.HibernateSpeakerRepositoryImpl;
import spring.fund.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
