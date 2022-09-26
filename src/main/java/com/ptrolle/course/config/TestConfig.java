package com.ptrolle.course.config;

import com.ptrolle.course.entities.User;
import com.ptrolle.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    //tudo que voce colocar nesse metodo sera instanciado quando colocado aqui dentro
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        //saveAll salva todos os dados colocados aqui inicializando uma lista atraves do (Arrays.asList)
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
