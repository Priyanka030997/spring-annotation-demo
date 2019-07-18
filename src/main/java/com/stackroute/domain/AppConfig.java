package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    //created bean for movie class
    @Bean
    public Movie movieBean()
    {
        Movie mov=new Movie();
        mov.setActor(actorBean());
        return mov;
    }
    //created bean for actor class
   @Bean
    public Actor actorBean()
    {
       return new Actor();

    }

}
