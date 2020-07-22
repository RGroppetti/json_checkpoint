package com.example.json_checkpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PagesController {
    @GetMapping("/movies/movie")
    public New_Movies movie(){
        Person person1 = new Person();
        person1.setFirstName("Francis Ford");
        person1.setLastName("Copolla");
        person1.setRole("Director");
        Person person2 = new Person();
        person2.setFirstName("Marlon");
        person2.setLastName("Brando");
        person2.setRole("Star");
        Person person3 = new Person();
        person3.setFirstName("Al");
        person3.setLastName("Pacino");
        person3.setRole("Star");
        Person person4 = new Person();
        person4.setFirstName("James");
        person4.setLastName("Caan");
        person4.setRole("Star");
        Person person5 = new Person();
        person5.setFirstName("Diane");
        person5.setLastName("Keaton");
        person5.setRole("Star");

        Person people[] = new Person[5];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;
        people[4] = person5;

        New_Movies movie = new New_Movies();
        movie.setTitle("The Godfather");
        movie.setMinutes(175);
        movie.setGenre("Crime, Drama");
        movie.setRating(9.2);
        movie.setMetaScore(100);
        movie.setDescription("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.");
        movie.setVotes(1561591);
        movie.setGross(134.97);
        movie.setYear("1972");
        movie.setCredits(people);

        return movie;
    }

    @PostMapping("/movies/gross/total")
    public Map<String, Integer> sumGrossTotal(@RequestBody() New_Movies[] movies) {
        int total = 0;
        for (New_Movies movie  : movies) {
            total += movie.getGross();
        }
        Map<String, Integer> result = new HashMap<>();
        result.put("result", total);
        return result;
    }
}
