import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.fund.service.SpeakerService;
import spring.fund.service.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appcontext = new AnnotationConfigApplicationContext(AppConfig.class);

//        SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service = appcontext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
