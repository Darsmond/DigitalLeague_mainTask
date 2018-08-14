package tourism.context;

import tourism.entity.User;
import tourism.entity.Tour;
import tourism.dao.GenericDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

    @Bean
    public User user() {
        User user = new User();
        return user;
    }

    @Bean
    public Tour tour() {
        Tour tour = new Tour();
        return tour;
    }

    @Bean
    public GenericDao dao(){
        return new GenericDao();
    }

}