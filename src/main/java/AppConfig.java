
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.fund.repository.HibernateSpeakerRepositoryImpl;
import spring.fund.repository.SpeakerRepository;
import spring.fund.service.SpeakerService;
import spring.fund.service.SpeakerServiceImpl;

public class AppConfig {
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());

        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }



}
