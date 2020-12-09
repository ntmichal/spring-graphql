package pl.maciocha.graphqlexample;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.maciocha.graphqlexample.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService{

    List<Movie> listOfMovies = new ArrayList<>();

    public List<Movie> getMovies(int size){
        return listOfMovies.stream().limit(size).collect(Collectors.toList());
    }

    public List<Movie> getAuthor(String author){
        return listOfMovies.stream().filter(
                x -> author.equals(x.getAuthor())
        ).collect(Collectors.toList());
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init(){
        listOfMovies.add(new Movie(0l,"Star Wars", "Goeorge Lucas"));
        listOfMovies.add(new Movie(1l,"Inception", "Christopher Nolan"));
    }
}
