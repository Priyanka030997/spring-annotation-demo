package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    public Actor actor;

    public Movie() {

    }
    public Movie(Actor actor) {
        this.actor = actor;
    }
@Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void display()
    {
        System.out.println("Actor name is:"+actor.getName()+" Actor gender is:"+actor.getGender()+" Actor age is:"+actor.getAge());
    }

}
