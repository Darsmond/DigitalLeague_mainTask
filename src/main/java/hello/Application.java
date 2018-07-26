package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import java.lang.System;
import java.io.*;

import java.util.List;

@SpringBootApplication

public class Application implements CommandLineRunner {

@Autowired
UserDao userDao;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
	

    }

@Override
public void run(String... args) {
//List<User> users = userDao.selectAll();
//	for (User current : users) {
//System.out.println("User_id is " + current.getId());
//}
}
}