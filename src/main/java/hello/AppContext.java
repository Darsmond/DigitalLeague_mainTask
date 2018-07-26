package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

@Bean
public User user(){

User user = new User();
return user;

}

@Bean
public UserDao userDao(){

return new UserDao();

}

}